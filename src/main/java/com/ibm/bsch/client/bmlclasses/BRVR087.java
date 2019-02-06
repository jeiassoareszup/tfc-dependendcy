package com.ibm.bsch.client.bmlclasses;

import com.ibm.dse.gui.extensions.BSCHButton;
import com.ibm.dse.gui.extensions.BSCHCrossRelation;
import com.ibm.dse.gui.extensions.BSCHOperationPanel;
import com.ibm.dse.gui.extensions.BSCHTable;

public class BRVR087 {

    public BRVR087() {
        panelPadre = new BSCHOperationPanel();
    }

    public void setClassLoader(ClassLoader classloader) {
        classLoader = classloader;
    }

    public BSCHOperationPanel exec() {
        try {
            panelPadre.setOperationName("dummyOp");
            panelPadre.setName("BRVR087");
            panelPadre.setTitle("Lista Geral de Bancos");
            panelPadre.setDimensions("0,0,550,458,C,C");
            panelPadre.setPreViewAction("com.ibm.bsch.client.launcher.ExecuteTransaction");
            panelPadre.setPreViewData("SRVTABLES,TABLE*'TCDT040'");
            panelPadre.setPreViewOutData("listDataTABLA*listDataSRVTABLES");
            panelPadre.setPreViewProcessParameters("LIST,PAGINATION");
            BSCHButton bschbutton = new BSCHButton();
            bschbutton.setName("ACEPTAR-1");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.ClosePanelAndHisProcesses");
            bschbutton.setBehaviour("RDONLY");
            bschbutton.setButtonType("OkIconClose");
            bschbutton.setLaunchAssocOperation("N");
            bschbutton.setDimensions("325,426,100,21");
            bschbutton.setText("Ok");
            panelPadre.add(bschbutton);
            BSCHButton bschbutton1 = new BSCHButton();
            bschbutton1.setName("ABANDONAR-1");
            bschbutton1.setClickProcess("com.ibm.bsch.client.launcher.RefreshTable");
            bschbutton1.setClickProcessData("TABLA-1,TABLA");
            bschbutton1.setButtonType("Abandonar");
            bschbutton1.setDimensions("430,426,100,21");
            bschbutton1.setText("Cancelar");
            bschbutton1.setIconFile("cancelar.gif");
            panelPadre.add(bschbutton1);
            BSCHTable bschtable = new BSCHTable();
            bschtable.setName("TABLA-1");
            bschtable.setButtonVisible("DOWN");
            bschtable.setStateBar("DOWN");
            bschtable.setDimensions("11,11,520,384");
            bschtable.setDataName("currentRowListDataTABLA");
            bschtable.setDataNameForTable("listDataTABLA");
            bschtable.setNumColumn("2");
            bschtable.setColumn("Bco.;ALPHANUMERIC;STBANCO(4-1)[0];50");
            bschtable.setColumn("Descri\347\343o;ALPHANUMERIC;NBBAN;450");
            panelPadre.add(bschtable);
            BSCHCrossRelation bschcrossrelation = new BSCHCrossRelation();
            bschcrossrelation.setName("Relation1");
            bschcrossrelation.setCondition("TABLA-1;SELECTED_ROW_COUNT;NUMERIC;EQ;VALUE;1");
            bschcrossrelation.setAction("ACEPTAR-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation.setElseAction("ACEPTAR-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            panelPadre.add(bschcrossrelation);
            return panelPadre;
        } catch (Exception exception) {
            System.err.println("ERROR: An exception was thrown:");
            exception.printStackTrace();
            return null;
        }
    }

    public static String version() {
        return "1.0";
    }

    private ClassLoader classLoader;
    private BSCHOperationPanel panelPadre;
}
