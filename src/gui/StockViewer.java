package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import stock.StockInput;

public class StockViewer extends JPanel{
	
	WindowFrame frame;
	
	StockManager stockManager;

	public StockViewer(WindowFrame frame, StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		System.out.println("*****" + stockManager.size() + "*****");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Manufacturing date");
		model.addColumn("Expiration date");
		
		for (int i=0; i< stockManager.size(); i++); {
			Vector row = new Vector();
			StockInput si = stockManager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getMdate());
			row.add(si.getEdate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

}
