package com.ikematsu.cursomc.services;

import com.ikematsu.cursomc.domain.Cliente;
import com.ikematsu.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	//void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}