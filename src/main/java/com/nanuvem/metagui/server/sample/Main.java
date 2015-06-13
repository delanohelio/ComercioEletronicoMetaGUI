package com.nanuvem.metagui.server.sample;

import com.nanuvem.metagui.server.MetaGuiEntryPoint;
import com.nanuvem.metagui.server.api.Cardinality;
import com.nanuvem.metagui.server.api.Widget;
import com.nanuvem.metagui.server.api.WidgetType;
import com.nanuvem.metagui.server.container.DomainModelContainer;
import com.nanuvem.metagui.server.controller.PropertyTypeType;
import com.nanuvem.metagui.server.sample.entities.Cliente;
import com.nanuvem.metagui.server.sample.entities.Fornecedor;
import com.nanuvem.metagui.server.sample.entities.ItemPedido;
import com.nanuvem.metagui.server.sample.entities.Pedido;
import com.nanuvem.metagui.server.sample.entities.Produto;
import com.nanuvem.metagui.server.sample.entities.Vendedor;

public class Main {

	public static void main(String[] args) {
		MetaGuiEntryPoint.run(args);
		Widget datePickerWidget = MetaGuiEntryPoint.createWidget("DatePickerWidget", WidgetType.Property, MetaGuiEntryPoint.readWidgetFile("DatePickerWidget.js"));
		Widget numberFormatterWidget = MetaGuiEntryPoint.createWidget("NumberFormatterWidget", WidgetType.Property, MetaGuiEntryPoint.readWidgetFile("NumberFormatter.js"));
		Widget comboBoxWidget = MetaGuiEntryPoint.createWidget("ComboBoxWidget", WidgetType.Relationship, MetaGuiEntryPoint.readWidgetFile("ComboBoxWidget.js"));
		MetaGuiEntryPoint.createRule("field", null, PropertyTypeType.date.name(), null, null, datePickerWidget, null);
		MetaGuiEntryPoint.createRule("field", null, null, "cpf", null, numberFormatterWidget, "{\"format\": \"000.000.000-00\", \"editable\": true}");
		MetaGuiEntryPoint.createRule("property", null, null, "cpf", null, numberFormatterWidget, "{\"format\": \"000.000.000-00\", \"editable\": false}");
		MetaGuiEntryPoint.createRule("fieldRelation", null, "Fornecedor", null, Cardinality.One, comboBoxWidget, "{\"propertyKey\": \"nomeFantasia\"}");
		DomainModelContainer.deploy(Cliente.class, Fornecedor.class,
				ItemPedido.class, Pedido.class, Produto.class, Vendedor.class);
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNomeFantasia("Nanuvem");
		Fornecedor fornecedor2 = new Fornecedor();
		fornecedor2.setNomeFantasia("Embedded");
		Fornecedor fornecedor3 = new Fornecedor();
		fornecedor3.setNomeFantasia("Asus");
		DomainModelContainer.saveInstance("fornecedores", fornecedor);
		DomainModelContainer.saveInstance("fornecedores", fornecedor2);
		DomainModelContainer.saveInstance("fornecedores", fornecedor3);
	}

}
