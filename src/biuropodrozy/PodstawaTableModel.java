/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biuropodrozy;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Xkonti
 */
public class PodstawaTableModel extends AbstractTableModel {
    
    private String[] columnNames;
    private Object[][] data;
    
    public void setColumnNames(String[] newColumnNames) {
        columnNames = newColumnNames;
    }
    
    public void setData(Object[][] newData) {
        data = newData;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
}
