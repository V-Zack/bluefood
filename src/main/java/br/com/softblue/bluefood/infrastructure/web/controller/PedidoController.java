package br.com.softblue.bluefood.infrastructure.web.controller;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.softblue.bluefood.application.service.ImageService;
import br.com.softblue.bluefood.domain.pedido.Pedido;
import br.com.softblue.bluefood.domain.pedido.PedidoRepository;

@Controller
@RequestMapping("/cliente/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping(path = "/view")
	public String viewPedido(
			    @RequestParam("pedidoId") Integer pedidoId,
		        Model model) {
		
			
			Pedido pedido = pedidoRepository.findById(pedidoId).orElseThrow(NoSuchElementException::new);
			model.addAttribute("pedido", pedido);
			
			return "cliente-pedido";
		}
		
		
	}
	
	

