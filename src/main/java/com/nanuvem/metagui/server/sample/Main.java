package com.nanuvem.metagui.server.sample;

import com.nanuvem.metagui.server.MetaGuiEntryPoint;
import com.nanuvem.metagui.server.container.DomainModelContainer;
import com.nanuvem.metagui.server.sample.entities.Cliente;
import com.nanuvem.metagui.server.sample.entities.Fornecedor;
import com.nanuvem.metagui.server.sample.entities.ItemPedido;
import com.nanuvem.metagui.server.sample.entities.Pedido;
import com.nanuvem.metagui.server.sample.entities.Produto;
import com.nanuvem.metagui.server.sample.entities.Vendedor;

public class Main {

	public static void main(String[] args) {
		MetaGuiEntryPoint.run(args);
		DomainModelContainer.deploy(Cliente.class, Fornecedor.class,
				ItemPedido.class, Pedido.class, Produto.class, Vendedor.class);
	}

}
