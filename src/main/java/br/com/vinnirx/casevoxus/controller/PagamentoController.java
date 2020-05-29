package br.com.vinnirx.casevoxus.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinnirx.casevoxus.domain.PagamentoDomain;
import br.com.vinnirx.casevoxus.repository.PagamentoRepository;

@RestController
public class PagamentoController {

	private PagamentoRepository pagamentoRepository;

	public PagamentoController(PagamentoRepository pagamentoRepository) {
		this.pagamentoRepository = pagamentoRepository;
	}

	@GetMapping("/teste")
	public ResponseEntity<String> teste() {

		return new ResponseEntity<String>("Hello World !", HttpStatus.OK);
	}

	@PostMapping("/criar")
	public PagamentoDomain novoPagamento(@RequestBody PagamentoDomain dadosFront) {

		return pagamentoRepository.save(dadosFront);

	}

	@GetMapping("/listar")
	public List<PagamentoDomain> listarPagamento() {
		return pagamentoRepository.findAll();
	}

	@DeleteMapping("/deletar")
	public void delete(String id) {
		pagamentoRepository.deleteById(id);
	}

	@PutMapping(value = "/atualizar")
	public ResponseEntity editar(String id, @RequestBody PagamentoDomain dadosDePgtoPassadosPeloFront) {
		return pagamentoRepository.findById(id).map(dadosAtualizados -> {
			dadosAtualizados.setTitulo(dadosDePgtoPassadosPeloFront.getTitulo());
			dadosAtualizados.setValor(dadosDePgtoPassadosPeloFront.getValor());
			dadosAtualizados.setData(dadosDePgtoPassadosPeloFront.getData());			
			dadosAtualizados.setComentario(dadosDePgtoPassadosPeloFront.getComentario());
			PagamentoDomain novoDados = pagamentoRepository.save(dadosAtualizados);
			return ResponseEntity.ok().body(novoDados);
		}).orElse(ResponseEntity.notFound().build());
	}
}
