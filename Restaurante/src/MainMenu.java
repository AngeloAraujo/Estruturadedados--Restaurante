import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Pilhapratos pilha	 = new Pilhapratos (5);
		FilaEntraRestaurante fila= new FilaEntraRestaurante(10);
		ListaMesa mesa = new ListaMesa();
		FilaCaixa caixa = new FilaCaixa(5);
		
	while (true) {	
		System.out.println("O que você deseja fazer?");
		System.out.println("1- Inserir cliente na fila.");
		System.out.println("2- Servir-se no Buffet.");
		System.out.println("3- Ver lista de mesas ocupadas.");
		System.out.println("4- Reservar mesa para o Cliente.");
		System.out.println("5- Ver quantas pessoas tem na fila do caixa");
		System.out.println("6- Entrar na fila de pagamento.");
		System.out.println("7- Realizar pagamento.");
		System.out.println("8- Ver quantos pratos tem disponiveis/Repor pratos na pilha.");
		System.out.println("9- Movimentação do caixa.");
		System.out.println("10- Sair.");

		int opcao= entrada.nextInt();
		
		if (opcao==1) {

		while(true) {	
			System.out.println("Insira a ordem de chegada: ");
			int dado = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Insira o nome do cliente:");
			String nome = entrada.nextLine();
			fila.inserir(dado, nome);
			
			System.out.println("Deseja continuar incluindo clientes? 1- sim  2- não");
			int cad = entrada.nextInt();
			
			if(cad==2) {
				break;
			}	
		}
		}

		if(opcao== 2) {
			
		while(true) {	
			System.out.println("Insira o número da comanda do cliente:");
			int comanda = entrada.nextInt();
			pilha.push(comanda);
			
			System.out.println("Deseja retirar cliente da fila de espera? 1- Sim  2-Não");
			int cliente = entrada.nextInt();
			
				if(cliente ==1) {
					fila.remover();
				}
			
			System.out.println("Deseja continuar incluindo comandas? 1- sim  2- não");
			int cad = entrada.nextInt();
			
			if(cad==2) {
				break;
			}	
		}
		}
		
		if(opcao == 3) {
			
			System.out.println("Mesas ocupadas:\n"+mesa.mostraLista());
		
				
			}
		if (opcao ==4) {
			
			while (true) {
				System.out.println("Mesas ocupadas: "+mesa.mostraLista());
				System.out.println("Escolha uma mesa para o cliente! Digitando o número disponíveis de 1 a 10.");
				int reserva = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Digite o nome do Cliente!");
				String nome= entrada.nextLine();
				mesa.inserirInicio(reserva, nome);
				
				System.out.println("Deseja continuar reservando mesas? 1- sim  2- não");
				int cad = entrada.nextInt();
				
				if(cad==2) {
					break;
				}
			}
		}
		
		if(opcao == 5) {
			
			if (caixa.mostraLista()=="") {
				System.out.println("Não há clientes na fila");
			}else {
			System.out.println(caixa.mostraLista());
			}
		}
		
		if (opcao ==6) {
			
			while(true) {
			System.out.println("Insira a mesa do Cliente:");
			int caixamesa = entrada.nextInt();
			entrada.nextLine();
			System.out.println("insira o nome do Cliente:");
			String caixanome = entrada.nextLine();
			
			caixa.inserir(caixamesa, caixanome);
			
			System.out.println("Deseja continuar incluindo clientes na fila de pagamento? 1- sim  2- não");
			int cad = entrada.nextInt();
			
			if(cad==2) {
				break;
			}
		}		
	}
		
		if (opcao == 7) {
			
			while (true) {
				
				System.out.println("Digite o valor a pagar: ");
				caixa.setValorapagar(entrada.nextFloat());
				System.out.println("Valor pago:");
				caixa.setDinheiro(entrada.nextFloat());
				System.out.println("Troco R$: "+caixa.trocototal());
				
				System.out.println("Deseja liberar mesa? 1- Sim  2-Não");
				int cliente = entrada.nextInt();
				
					if(cliente ==1) {
						System.out.println("Digite o número da mesa do cliente!");
						int opcaomesa = entrada.nextInt();
						mesa.removeComValor(opcaomesa);
						caixa.remover();
						System.out.println("Mesa liberada e cliente retirado da fila de pagamento");
					}	
					else {
						break;
					}
					
				System.out.println("Deseja realizar mais pagamentos? 1- Sim  2-Não");
				int pagamentos = entrada.nextInt();
				
				if(pagamentos ==2) {
					break;
				}
			}
		}
		
		if (opcao == 8) {
			while (true) {
				System.out.println("Quantidade de pratos disponíveis: "+pilha.quantidadepratosdisponiveis());

				System.out.println("Deseja repor pratos? 1- Sim  2-Não.");
				int repor= entrada.nextInt();
				
				if (repor ==1) {
					
					System.out.println("Insira quantos pratos você quer repor");
					int qtdpratos = entrada.nextInt();
					int tamanhopilha=qtdpratos;
					while (tamanhopilha!= 0) {
					if (qtdpratos>0 && qtdpratos<=pilha.getLimite()) {
						pilha.pop();
						tamanhopilha--;
						
					}else {
						break;
					}
					}
				}else {
					break;
				}
				}
		}				
		if (opcao ==9) {
			
			System.out.println("Quantidade de pessoas na fila para almoçar: "+fila.mostraLista());
			System.out.println("Quantidade de pessoas na fila do caixa: "+ caixa.contafila());
			System.out.println("Quantidade de pessoas almoçando no restaurante: "+mesa.almocando());
			System.out.println("Quantidade de pessoas atendidas no restaurante: "+(fila.Contalista()+mesa.almocando()+caixa.contafila()));
			System.out.println("Quantidade de pratos na pilha: "+pilha.quantidadepratosdisponiveis());
			System.out.println("Quantidade de mesas livres: "+mesa.disponiveis());
			System.out.println("Valor total de vendas: "+caixa.vendas());
			System.out.println("Quantidade de vendas do dia: "+ caixa.Contavendas());
			

		}
		
		if (opcao ==10) {
			System.out.println("Programa encerrado!!");
			System.exit(opcao);
		}
	}
}
}

		
	




