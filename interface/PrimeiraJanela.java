package Mario ; //definindo o nome do pacote local
    //importacao imports
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

             //implementaçao da classe
            class PrimeiraJanela extends JFrame{

                //declarando variaveis
                JLabel rotulo1,rotulo2, exibir;
                JTextField texto1, texto2;
                JButton somar;
                JButton subtrair;
                JButton multiplicar;
                JButton dividir;

                public PrimeiraJanela(){

                    //implementando objetos
                    super("minha primeira janela");
                    Container tela = getContentPane();
                    setLayout(null);
                    rotulo1 = new JLabel("1° Numero");
                    rotulo2 =new JLabel("2° Numero");
                    texto1 = new JTextField(5);
                    texto2 = new JTextField(5);
                    somar = new JButton("somar");
                    subtrair = new JButton("subtrair");
                    multiplicar = new JButton("Multiplicar");
                    dividir = new JButton("Dividir");
                    exibir = new JLabel("");
                    

                    //setBounds(Coluna, linha, largura, altura)
                    //posicionado objetos na tela
                    rotulo1.setBounds(50,20,100,20);//posicionando e definindo tamanho do rotulo 1
                    rotulo2.setBounds(50,60,100,120);//posicionando e definindo tamanho do rotulo 2
                    texto1.setBounds(140,20,200,20);//posicionando e definindo tamanho do texto 1
                    texto2.setBounds(140,60,200,20);//posicionando e definindo tamanho do texto 2
                    exibir.setBounds(50,120,200,20);//posicionando e definindo tamanho do resultado
                    somar.setBounds(150,100,90,20);//posicionando e definindo tamanho do botao de somar
                    subtrair.setBounds(150, 150, 90, 20);
                    multiplicar.setBounds(150, 200, 90, 20);
                    dividir.setBounds(150, 250, 90, 20);


                    exibir.setVisible(false);//posicionando e definindo tamanho do resultado
                    

                    //Funcao somar
                    somar.addActionListener(//criando acao de somar

                        new ActionListener() {
                            public void actionPerformed(ActionEvent e){

                                float n1, n2, soma = 0;
                                n1= Float.parseFloat(texto1.getText());
                                n2= Float.parseFloat(texto2.getText());
                                soma = n1 + n2;
                                exibir.setVisible(true);
                                exibir.setText("A soma é:"+ soma);    
                            }   
                        }
                    );

                     //Funcao subtrair
                    somar.addActionListener(//criando acao de subtrair

                        new ActionListener() {
                            public void actionPerformed(ActionEvent e){

                                float n1, n2, subtracao = 0;
                                n1= Float.parseFloat(texto1.getText());
                                n2= Float.parseFloat(texto2.getText());
                                subtracao = n1 - n2;
                                exibir.setVisible(true);
                                exibir.setText("A subtraçao é:"+ subtracao);    
                            }
                            
                        }
                    );

                     //Funcao multiplicar
                    somar.addActionListener(//criando acao de multiplicar

                        new ActionListener() {
                            public void actionPerformed(ActionEvent e){

                                float n1, n2, multiplicar = 0;
                                n1= Float.parseFloat(texto1.getText());
                                n2= Float.parseFloat(texto2.getText());
                                multiplicar = n1 * n2;
                                exibir.setVisible(true);
                                exibir.setText("A multiplicacao é:"+ multiplicar);    
                            }
                            
                        }
                    );
                     //Funcao dividir
                    somar.addActionListener(//criando acao de dividir

                        new ActionListener() {
                            public void actionPerformed(ActionEvent e){

                                float n1, n2, dividir = 0;
                                n1= Float.parseFloat(texto1.getText());
                                n2= Float.parseFloat(texto2.getText());
                                dividir = n1 / n2;
                                exibir.setVisible(true);
                                exibir.setText("A divisao é:"+ dividir);    
                            }
                            
                        }
                    );
                    

                    
                    //adicionando na tela
                    tela.add(rotulo1);
                    tela.add(rotulo2);
                    tela.add(exibir);
                    tela.add(texto1);
                    tela.add(texto2);
                    tela.add(somar);
                    tela.add(subtrair);
                    tela.add(multiplicar);
                    tela.add(dividir);
                    

                    setSize(500, 500);//definindo tamanho da janela 
                    setVisible(true);// definindo a visibilidade da janela
                    setLocationRelativeTo(null);//definindo spawn da tela
                }
            

    }