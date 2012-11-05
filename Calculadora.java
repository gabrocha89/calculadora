import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.xml.stream.events.StartElement;

import java.math.*;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField JTextField1;
	
    /**
     * Variáveis de cálculo
     */

	String igual;
	String operacao;
	String temp,numeroAntes,copia;
	double num1, num2, resultado;
	private JTextField JTextField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/javax/swing/plaf/metal/icons/ocean/collapsed-rtl.gif")));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 341);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Calculadora");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmSair = new JMenuItem("Sair    ");
		mntmSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmSair.setIcon(new ImageIcon(Calculadora.class.getResource("/javax/swing/plaf/metal/icons/ocean/close.gif")));
		mntmSair.setSelectedIcon(null);
		mnNewMenu_1.add(mntmSair);
		
		JMenu mnNewMenu_2 = new JMenu("Editar");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Copiar    ");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				copia = JTextField1.getText();
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(Calculadora.class.getResource("/com/sun/java/swing/plaf/windows/icons/NewFolder.gif")));
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Colar");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField1.setText(copia);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Calculadora.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Sobre");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new JFSobre().show();
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		menuBar.add(mnSair);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField1 = new JTextField();
		JTextField1.setText("0");
		JTextField1.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField1.setBackground(new Color(230, 230, 250));
		JTextField1.setFont(new Font("SimSun", Font.BOLD, 20));
		JTextField1.setBounds(10, 35, 247, 36);
		contentPane.add(JTextField1);
		JTextField1.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("7");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("7");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "7");
					}
			}
		});
		btn7.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn7.setBounds(10, 145, 47, 28);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("8");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("8");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "8");
					}
			}
		});
		btn8.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn8.setBounds(58, 145, 47, 28);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("9");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("9");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "9");
					}
			}
		});
		btn9.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn9.setBounds(107, 145, 47, 28);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("4");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("4");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "4");
					}
			}
		});
		btn4.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn4.setBounds(10, 176, 47, 28);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("5");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("5");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "5");
					}
				
			}			
		});
		btn5.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn5.setBounds(58, 176, 47, 28);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("6");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("6");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "6");
				}
			}
		});
		btn6.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn6.setBounds(107, 176, 47, 28);
		contentPane.add(btn6);
		
		JButton btnBackspace = new JButton("\u2190");
		btnBackspace.setForeground(Color.BLACK);
		btnBackspace.setBorder(UIManager.getBorder("Button.border"));
		btnBackspace.setToolTipText("Apaga o \u00FAltimo n\u00FAmero digitado");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String BackFieldText=JTextField1.getText();
				if (!"".equals(BackFieldText)){
				   String SubStr = BackFieldText.substring(0,BackFieldText.length()-1);
				   JTextField1.setText(""+SubStr);
				   
				}
			}
		});
		btnBackspace.setIcon(null);
		btnBackspace.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBackspace.setBounds(10, 113, 47, 28);
		contentPane.add(btnBackspace);
		
		JButton btnCE = new JButton("CE");
		btnCE.setToolTipText("Limpa o \u00FAltimo n\u00FAmero digitado");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                num2 = 0;
				JTextField1.setText("0");
							}
		});
		btnCE.setFont(new Font("Utsaah", Font.BOLD, 12));
		btnCE.setBounds(58, 113, 47, 28);
		contentPane.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.setToolTipText("Limpa todos os n\u00FAmeros e c\u00E1lculos");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                num1 = 0;
                num2 = 0;
                operacao = "0";
				JTextField1.setText("0");
				JTextField2.setText(null);
			}
		});
		btnC.setFont(new Font("Utsaah", Font.BOLD, 14));
		btnC.setBounds(107, 113, 47, 28);
		contentPane.add(btnC);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("1");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("1");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "1");
					}
			}
		});
		btn1.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn1.setBounds(10, 207, 47, 28);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("2");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("2");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "2");
					}
			}
		});
		btn2.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn2.setBounds(58, 207, 47, 28);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("3");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("3");
				}
				else{
						JTextField1.setText(JTextField1.getText() + "3");
					}

			}
		});
		btn3.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn3.setBounds(107, 207, 47, 28);
		contentPane.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(igual=="="){
					JTextField1.setText(null);
					JTextField1.setText("0");
					igual = null;
				}
				
				else if(JTextField1.getText().equals("0")){
					JTextField1.setText("0");
				}

				else{
						JTextField1.setText(JTextField1.getText() + "0");
					}
			}
		});
		btn0.setFont(new Font("Utsaah", Font.BOLD, 18));
		btn0.setBounds(10, 239, 95, 28);
		contentPane.add(btn0);
		
		JButton btnVirgula = new JButton(".");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!JTextField1.getText().contains(".")){
					JTextField1.setText(JTextField1.getText() + ".");
				}
						}
		});
		btnVirgula.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnVirgula.setBounds(107, 239, 47, 28);
		contentPane.add(btnVirgula);
		
		JButton btnMc = new JButton("MC");
		btnMc.setForeground(Color.RED);
		btnMc.setFont(new Font("Utsaah", Font.BOLD, 12));
		btnMc.setBounds(10, 82, 47, 28);
		contentPane.add(btnMc);
		
		JButton btnMr = new JButton("MR");
		btnMr.setForeground(Color.RED);
		btnMr.setFont(new Font("Utsaah", Font.BOLD, 12));
		btnMr.setBounds(58, 82, 47, 28);
		contentPane.add(btnMr);
		
		JButton btnMs = new JButton("MS");
		btnMs.setForeground(Color.RED);
		btnMs.setToolTipText("");
		btnMs.setFont(new Font("Utsaah", Font.BOLD, 12));
		btnMs.setBounds(107, 82, 47, 28);
		contentPane.add(btnMs);
		
		JButton btnM_1 = new JButton("M+");
		btnM_1.setForeground(Color.RED);
		btnM_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnM_1.setFont(new Font("Utsaah", Font.BOLD, 13));
		btnM_1.setBounds(159, 82, 47, 28);
		contentPane.add(btnM_1);
		
		JButton btnMaisOuMenos = new JButton("\u00B1");
		btnMaisOuMenos.setToolTipText("Modifica de positivo para negativo");
		btnMaisOuMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String signalFieldText=JTextField1.getText();
				if(!"".equals(signalFieldText)){
				   String SubStr=signalFieldText.substring(0,1);
				if("-".equals(SubStr)){
				   SubStr=signalFieldText.substring(1,signalFieldText.length());
				   JTextField1.setText(""+SubStr);
				}else {
				   JTextField1.setText("-"+signalFieldText);
				}
				}
			}
		});
		btnMaisOuMenos.setForeground(Color.BLACK);
		btnMaisOuMenos.setFont(new Font("Utsaah", Font.BOLD, 14));
		btnMaisOuMenos.setBounds(159, 113, 47, 28);
		contentPane.add(btnMaisOuMenos);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setToolTipText("Divis\u00E3o");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!JTextField2.getText().contains("+") && !JTextField2.getText().contains("-") && !JTextField2.getText().contains("*") && !JTextField2.getText().contains("/")){
					operacao = "/";
			        num1 = Double.parseDouble(JTextField1.getText());
			        
			        JTextField2.setText(JTextField1.getText() + " /");
			        JTextField1.setText(null);
		      		} 
				else {
					num2 = Double.parseDouble(JTextField1.getText());
					switch (operacao) {
		                    case "+":
		                        resultado = num1 + num2;
		                        break;
		                    case "-":
		                        resultado = num1 - num2;
		                        break;
		                    case "*":
		                        resultado = num1 * num2;
		                        break;
		                    case "/":
		                        if (num2 == 0) {
		                            JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
		                        } else {
			                        resultado = num1 / num2;
		                        }
		                        break;
		                    default:
		                        JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
		                        break;
		                }
					   	JTextField1.setText(String.valueOf(resultado));	
					   
					JTextField1.setText(null);
				    num1 = resultado;
			        JTextField2.setText(JTextField2.getText() + " " +  num2 + " = " + resultado + " /");	
			        operacao = "/";

			      
					
				}
		}
	});
		btnDivisao.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnDivisao.setBounds(159, 145, 47, 28);
		contentPane.add(btnDivisao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setToolTipText("Multiplica\u00E7\u00E3o");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!JTextField2.getText().contains("+") && !JTextField2.getText().contains("-") && !JTextField2.getText().contains("*") && !JTextField2.getText().contains("/")){
					operacao = "*";
			        num1 = Double.parseDouble(JTextField1.getText());
			        
			        JTextField2.setText(JTextField1.getText() + " *");
			        JTextField1.setText(null);
		      		} 
				else {
					num2 = Double.parseDouble(JTextField1.getText());
					switch (operacao) {
		                    case "+":
		                        resultado = num1 + num2;
		                        break;
		                    case "-":
		                        resultado = num1 - num2;
		                        break;
		                    case "*":
		                        resultado = num1 * num2;
		                        break;
		                    case "/":
		                        if (num2 == 0) {
		                            JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
		                        } else {
			                        resultado = num1 / num2;
		                        }
		                        break;
		                    default:
		                        JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
		                        break;
		                }
					   	JTextField1.setText(String.valueOf(resultado));						
        
					JTextField1.setText(null);
				    num1 = resultado;
			        JTextField2.setText(JTextField2.getText() + " " +  num2 + " = " + resultado + " *");	
			        operacao = "*";

			      
					
				}
		}
	});
		btnMultiplicacao.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnMultiplicacao.setBounds(159, 176, 47, 28);
		contentPane.add(btnMultiplicacao);
		
		JButton btnM = new JButton("M-");
		btnM.setForeground(Color.RED);
		btnM.setFont(new Font("Utsaah", Font.BOLD, 15));
		btnM.setBounds(210, 82, 47, 28);
		contentPane.add(btnM);
		
		JButton btnRaiz = new JButton("\u221A");
		btnRaiz.setToolTipText("Raiz Quadrada");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(JTextField1.getText());
                JTextField2.setText("sqrt(" + JTextField1.getText() + ")");
				JTextField1.setText(String.valueOf(Math.sqrt(num1)));
			}
		});
		btnRaiz.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRaiz.setBounds(210, 113, 47, 28);
		contentPane.add(btnRaiz);
		
		JButton btnResto = new JButton("%");
		btnResto.setForeground(Color.RED);
		btnResto.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnResto.setBounds(210, 145, 47, 28);
		contentPane.add(btnResto);
		
		JButton btnFatorial = new JButton("1/x");
		btnFatorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(JTextField1.getText());
                JTextField2.setText("reciproc(" + JTextField1.getText() + ")");
				JTextField1.setText(String.valueOf((1/num1)));                
			}
		});
		btnFatorial.setFont(new Font("Utsaah", Font.BOLD, 13));
		btnFatorial.setBounds(210, 176, 47, 28);
		contentPane.add(btnFatorial);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(JTextField1.getText());
	               
				switch (operacao) {
	                    case "+":
	                        resultado = num1 + num2;
	                        break;
	                    case "-":
	                        resultado = num1 - num2;
	                        break;
	                    case "*":
	                        resultado = num1 * num2;
	                        break;
	                    case "/":
	                        if (num2 == 0) {
	                            JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
	                        } else {
		                        resultado = num1 / num2;
	                        }
	                        break;
	                    default:
	                        JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
	                        break;
	                }
	               	JTextField1.setText(String.valueOf(resultado));
	               	JTextField2.setText(null);
	               	igual = "=";
			}
		});
		btnIgual.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnIgual.setBounds(210, 207, 47, 60);
		contentPane.add(btnIgual);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setToolTipText("Subtra\u00E7\u00E3o");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!JTextField2.getText().contains("+") && !JTextField2.getText().contains("-") && !JTextField2.getText().contains("*") && !JTextField2.getText().contains("/")){
					operacao = "-";
			        num1 = Double.parseDouble(JTextField1.getText());
			        
			        JTextField2.setText(JTextField1.getText() + " -");
			        JTextField1.setText(null);
		      		} 
				else {
					num2 = Double.parseDouble(JTextField1.getText());
					switch (operacao) {
		                    case "+":
		                        resultado = num1 + num2;
		                        break;
		                    case "-":
		                        resultado = num1 - num2;
		                        break;
		                    case "*":
		                        resultado = num1 * num2;
		                        break;
		                    case "/":
		                        if (num2 == 0) {
		                            JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
		                        } else {
			                        resultado = num1 / num2;
		                        }
		                        break;
		                    default:
		                        JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
		                        break;
		                }
					   	JTextField1.setText(String.valueOf(resultado));						
        
					JTextField1.setText(null);
					num1 = resultado;
				    JTextField2.setText(JTextField2.getText() + " " +  num2 + " = " + resultado + " -");
			        operacao = "-";

			      
					
				}
		}
	});
		btnSubtracao.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnSubtracao.setBounds(159, 207, 47, 28);
		contentPane.add(btnSubtracao);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setToolTipText("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					if(!JTextField2.getText().contains("+") && !JTextField2.getText().contains("-") && !JTextField2.getText().contains("*") && !JTextField2.getText().contains("/")){
						operacao = "+";
				        num1 = Double.parseDouble(JTextField1.getText());
				        
				        JTextField2.setText(JTextField1.getText() + " +");
				        JTextField1.setText(null);
			      		} 
					else {
						num2 = Double.parseDouble(JTextField1.getText());
						switch (operacao) {
			                    case "+":
			                        resultado = num1 + num2;
			                        break;
			                    case "-":
			                        resultado = num1 - num2;
			                        break;
			                    case "*":
			                        resultado = num1 * num2;
			                        break;
			                    case "/":
			                        if (num2 == 0) {
			                            JOptionPane.showMessageDialog(null, "Erro: impossível dividir por zero");
			                        } else {
				                        resultado = num1 / num2;
			                        }
			                        break;
			                    default:
			                        JOptionPane.showMessageDialog(null, "Erro: operador inválido ou elementos insuficientes");
			                        break;
			                }
						   	JTextField1.setText(String.valueOf(resultado));						
	        
						JTextField1.setText(null);
						num1 = resultado;
					    JTextField2.setText(JTextField2.getText() + " " +  num2 + " = " + resultado + " +");		
				        operacao = "+";
						
					}
			}
		});
		btnSoma.setFont(new Font("Utsaah", Font.BOLD, 18));
		btnSoma.setBounds(159, 239, 47, 28);
		contentPane.add(btnSoma);
		
		JLabel lblNewLabel = new JLabel("Criado por Gabriel Rocha");
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.PLAIN, 11));
		lblNewLabel.setBounds(138, 278, 119, 14);
		contentPane.add(lblNewLabel);
		
		JTextField2 = new JTextField();
		JTextField2.setBackground(new Color(230, 230, 250));
		JTextField2.setHorizontalAlignment(SwingConstants.RIGHT);
		JTextField2.setBounds(10, 11, 247, 28);
		contentPane.add(JTextField2);
		JTextField2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("v1.0");
		lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 278, 46, 14);
		contentPane.add(lblNewLabel_1);
		
        /**
         * Configurações finais da janela - tornar visível, evitar redimensionamento
         */
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
