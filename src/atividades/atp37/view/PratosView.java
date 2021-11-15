package atividades.atp37.view;

import atividades.atp37.controller.PratosController;
import atividades.atp37.model.Prato;

public class PratosView {
    public static void main(String[] args) {
        PratosController controller = new PratosController();

        Prato prato = new Prato("Macarronada", 15.99);
        
        controller.create(prato);
        controller.create(new Prato("Lasanha 4 queijos", 24.99));
        controller.create(new Prato("Lasanha a bolonhesa", 26.99));

        System.out.println("--- Criando 3 pratos ---");
        for (Prato p : controller.read()) {
            System.out.println(p);            
        }

        System.out.println("--- Atualizando prato ---");

        Prato pratoAtualizado = new Prato();
        pratoAtualizado.setNome("Macarrão a carbonara");
        pratoAtualizado.setValor(30.99);
        pratoAtualizado.setId(prato.getId());

        controller.update(pratoAtualizado);

        for (Prato p : controller.read()) {
            System.out.println(p);            
        }

        System.out.println("--- Excluindo prato ---");

        controller.delete(prato);
        
        for (Prato p : controller.read()) {
            System.out.println(p);            
        }

    }
}
