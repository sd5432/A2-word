package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrderUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField btea;
	private JTextField gtea;
	private JTextField mtea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUi frame = new OrderUi();
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
	public OrderUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(10, 10, 564, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("訂單");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("標楷體", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(77, 10, 400, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(10, 90, 330, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 22, 60, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("紅茶:");
		lblNewLabel_1_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 78, 60, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("綠茶:");
		lblNewLabel_1_2.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 142, 60, 30);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("奶茶:");
		lblNewLabel_1_3.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 209, 60, 30);
		panel_1.add(lblNewLabel_1_3);
		
		name = new JTextField();
		name.setBounds(80, 22, 161, 30);
		panel_1.add(name);
		name.setColumns(10);
		
		btea = new JTextField();
		btea.setColumns(10);
		btea.setBounds(80, 84, 161, 30);
		panel_1.add(btea);
		
		gtea = new JTextField();
		gtea.setColumns(10);
		gtea.setBounds(80, 142, 161, 30);
		panel_1.add(gtea);
		
		mtea = new JTextField();
		mtea.setColumns(10);
		mtea.setBounds(80, 209, 161, 30);
		panel_1.add(mtea);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("是否會員:");
		lblNewLabel_1_3_1.setFont(new Font("標楷體", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(10, 272, 98, 30);
		panel_1.add(lblNewLabel_1_3_1);
		
		JCheckBox memberCheck = new JCheckBox("有");
		memberCheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		memberCheck.setFont(new Font("標楷體", Font.BOLD, 20));
		memberCheck.setBounds(181, 273, 60, 28);
		panel_1.add(memberCheck);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(350, 86, 224, 465);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("清除");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				btea.setText("");
				gtea.setText("");
				mtea.setText("");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("標楷體", Font.BOLD, 20));
		btnNewButton.setBounds(40, 396, 105, 39);
		panel_1.add(btnNewButton);
		
		
		/*---確認按鈕----*/
		JButton btnNewButton_1 = new JButton("確認");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String N = name.getText();
				String B = btea.getText();
				String G = gtea.getText();
				String M = mtea.getText();
				
				boolean isMember = memberCheck.isSelected();
				
				Order x =new Order(N,Integer.parseInt(B),Integer.parseInt(G),Integer.parseInt(M),isMember);
				
				String a = x.show();
				if (isMember && x.getSum() > 2000) {
		            int f = (int) Math.round(0.95 * x.getSum());
		            a += "\n" + "消費總金額超過2000";
		            a += "\n" + "總金額打95折:" + f;
		            a += "\n" +"您尚未加入\nVIP客戶\n無會員折扣\n共:"+f;
		        } else if (isMember && x.getSum() > 2000) {
		            int d = (int) Math.round(0.95 * x.getSum());
		            a += "\n" + "消費寵金額超過2000";
		            a += "\n" + "总金額打95折:" + d;
		            int s = (int) Math.round(0.95 * d);
		            a += "\n" + "您為VIP客戶，\n總金額再打95折,\n共：" + s;
		        } else if (x.getSum() > 2000) {
		            int fd = (int) Math.round(0.95 * x.getSum());
		            a += "\n" + "消費總金額超過2000";
		            a += "\n" + "總金額打95折:" + fd;
		            a += "\n" + x.over();
		        } else if (isMember) {
		            int discount = (int) Math.round(0.95 * x.getSum());
		            a += "\n" + x.less() + "\n" + "您為VIP客戶，\n總金額打95折,\n共：" + discount;
		        } else {
		            a += "\n" + x.less() + "\n" + x.noMember();
		        }
				textArea.setText(a);
		    }
				
			
		});
		btnNewButton_1.setFont(new Font("標楷體", Font.BOLD, 20));
		btnNewButton_1.setBounds(174, 396, 105, 39);
		panel_1.add(btnNewButton_1);
	}

	
}
