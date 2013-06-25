package controle;

import java.awt.Component;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class MyTableModel extends AbstractTableModel{
	//public String [] columnName = {"Nom","Adresse1","Adresse2","Telephone1","Telephone2"};
	public int iNbLine ;
	public int iNbCol ;
	
	// Entete de colonne

	private Vector oVectColHeader ;
	
	// Vecteur des lignes : chaque ligne est constituée d'un vecteur de colonnes
	
	private Vector oVectLine  ;
	
	boolean bEditable;

	
	public MyTableModel(String _tsColHeader[]){
		super () ;
		oVectLine = new Vector () ;
		oVectColHeader = new Vector () ;
		for (int iIndex = 0 ; iIndex < _tsColHeader.length ; iIndex++)
		{
			oVectColHeader.addElement (_tsColHeader[iIndex]) ;
		}
		iNbLine = 0 ;
		bEditable = true ;
		iNbCol = _tsColHeader.length ;
	}

	public void setEditable (boolean _bEdit)
	{
		bEditable = _bEdit ;
	}
	// Suppression de toutes les lignes

	public void removeAllRows ()
	{
		iNbLine = 0 ;
		oVectLine.removeAllElements () ;
	}
	
	// Ajout d'une nouvelle ligne

	public void addNewRow ()
	{
		iNbLine++ ;
		Vector oVectNewLine = new Vector () ;
		for (int iIndex = 0 ; iIndex < iNbCol ; iIndex++)
		{
			oVectNewLine.addElement (new java.lang.Object ());
		}
		oVectLine.addElement (oVectNewLine) ;
	}

	// Méthodes obligatoires (héritées de AbstractTableModel)

	@Override
	public int getColumnCount() {
		
		return iNbCol;
	}

	@Override
	public int getRowCount() {
		
		return iNbLine;
	}
	
	public String getColumnName(int _iColumnIndex) {
		return (String) oVectColHeader.elementAt (_iColumnIndex) ;
    }

	public Object getValueAt (int _iLig, int _iCol)
	{
		Object oObj = null ;
		if (_iLig < iNbLine)
		{
			Vector oLine = (Vector) oVectLine.elementAt (_iLig) ;
			oObj = oLine.elementAt (_iCol) ;
		}
		if (oObj == null )
		{
			oObj = "";
		}
		return oObj ;
	}
	
	public boolean isCellEditable (int _iLig, int _iCol)
	{
		return bEditable ;
	}

	public void setValueAt (Object _oObjectValue, int _iLig, int _iCol)
	{
		Vector oLine = (Vector) oVectLine.elementAt (_iLig) ;
		oLine.setElementAt (_oObjectValue, _iCol) ;
		oVectLine.setElementAt (oLine, _iLig) ;
		fireTableDataChanged () ;
	}
//	public Class<Icon> getColumnClass(int column)  
//	{  
//	    if (column == 0)  
//	    {  
//	        return Icon.class;  
//	    }  
//	    // other code; default to Object.class  
//		return null;
//	}

	@Override
    public Class<?> getColumnClass (int columnIndex) {
        return String.class;
    }
	

	
}
