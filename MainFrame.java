import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MainFrame extends JFrame {
	static int InputNumber(String caption) {
		Scanner sc = new Scanner(System.in);
		String  count1  = JOptionPane.showInputDialog(null, "Введите количество чисел:", null );
	    int  count = Integer.parseInt(count1);
		return count;
		
		
		
	}
	static double Numbers(String caption) {
		Scanner scan = new Scanner(System.in);
		String num1 = JOptionPane.showInputDialog(null, "Введите число:");
		int num = Integer.parseInt(num1);
		return num;
	}

	private static final long serialVersionUID = 1L;
	private  JPanel contentPane;
	private static JTextField textArr;
	private static JTextField textSum;
	private static JTextField textAvg;
	private static JTextField textMax;
	private static  JTextField textMin;
	static double [] arr;
	public static void MathStats() {
		double sum = 0;
		String arrS = "";
		double min = arr[0];
		double max = arr[0];
		for (double a : arr) {
		arrS += a + " ";
		sum += a;
		if (a < min) min = a;
		if (a > max) max = a;
		}
		textArr.setText(arrS);
		textSum.setText(String.valueOf(sum));
		textMax.setText(String.valueOf(max));
		textMin.setText(String.valueOf(min));
		textAvg.setText(String.valueOf(sum/arr.length));
		textArr.setCaretPosition(0);
		textSum.setCaretPosition(0);
		textMax.setCaretPosition(0);
		textMin.setCaretPosition(0);
		textAvg.setCaretPosition(0);
		
	}
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				int count = InputNumber("");
				arr = new double[count];
			   for(int i = 1; i <= count; i++) {
				   arr[i-1] = Numbers("");
				   
				   
			   }
			   MathStats();
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setAutoRequestFocus(false);
		setTitle("Статистика");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Массив:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 22, 70, 22);
		contentPane.add(lblNewLabel);
		
		textArr = new JTextField();
		textArr.setBackground(new Color(255, 255, 255));
		textArr.setEditable(false);
		textArr.setBounds(101, 26, 290, 18);
		contentPane.add(textArr);
		textArr.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new TitledBorder(null, "\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 80, 386, 149);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Сумма:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 46, 61, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ср. Ариф.:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 92, 74, 17);
		panel.add(lblNewLabel_2);
		
		textSum = new JTextField();
		textSum.setBackground(Color.WHITE);
		textSum.setEditable(false);
		textSum.setBounds(88, 46, 86, 20);
		panel.add(textSum);
		textSum.setColumns(10);
		
		textAvg = new JTextField();
		textAvg.setBackground(Color.WHITE);
		textAvg.setEditable(false);
		textAvg.setBounds(88, 92, 86, 20);
		panel.add(textAvg);
		textAvg.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Max:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(198, 46, 46, 17);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Min:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(198, 92, 46, 17);
		panel.add(lblNewLabel_4);
		
		textMax = new JTextField();
		textMax.setBackground(Color.WHITE);
		textMax.setEditable(false);
		textMax.setBounds(238, 46, 86, 20);
		panel.add(textMax);
		textMax.setColumns(10);
		
		textMin = new JTextField();
		textMin.setBackground(Color.WHITE);
		textMin.setEditable(false);
		textMin.setBounds(238, 92, 86, 20);
		panel.add(textMin);
		textMin.setColumns(10);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textArr, textSum, textAvg, textMax, textMin, contentPane, lblNewLabel, panel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4}));
		 
		
	   
	}
    
}
