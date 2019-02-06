// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   BRVR085.java

package com.ibm.bsch.client.bmlclasses;

import com.ibm.dse.gui.extensions.*;

public class BRVR085 {

    public BRVR085() {
        panelPadre = new BSCHOperationPanel();
    }

    public void setClassLoader(ClassLoader classloader) {
        classLoader = classloader;
    }

    public BSCHOperationPanel exec() {

        try {
            panelPadre.setOperationName("dummyOp");
            panelPadre.setName("BRVR085");
            panelPadre.setTitle("Consulta de Bancos");
            panelPadre.setDimensions("0,0,760,458,C,C");
            BSCHLabel bschlabel = new BSCHLabel();
            bschlabel.setName("L-BANCO-1");
            bschlabel.setText("Bco.");
            bschlabel.setDimensions("25,32,23,15");
            bschlabel.setBehaviour("OPT");
            panelPadre.add(bschlabel);
            BSCHTextField bschtextfield = new BSCHTextField();
            bschtextfield.setName("BANCO-1");
            bschtextfield.setDataName("BANCO");
            bschtextfield.setType("FILLED");
            bschtextfield.setMaxChars(4);
            bschtextfield.setDimensions("25,49,34,16");
            panelPadre.add(bschtextfield);
            BSCHButton bschbutton = new BSCHButton();
            bschbutton.setName("PESC-1");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton.setClickProcessParameters("LIST,PAGINATION");
            bschbutton.setClickProcessData("VR90,CDBCO*BANCO");
            bschbutton.setClickProcessOutData("listDataTABLA*listDataVR90");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.LauncherCrossRelationByName");
            bschbutton.setClickProcessData("Relation2");
            bschbutton.setButtonType("Buscar");
            bschbutton.setLaunchAssocOperation("N");
            bschbutton.setDimensions("628,42,100,21");
            bschbutton.setText("Pesquisar");
            panelPadre.add(bschbutton);
            BSCHButton bschbutton1 = new BSCHButton();
            bschbutton1.setName("PESC-2");
            bschbutton1.setClickProcess("com.ibm.bsch.client.launcher.LauncherCrossRelationByName");
            bschbutton1.setClickProcessData("Relation3");
            bschbutton1.setClickProcess("com.ibm.bsch.client.launcher.RefreshTable");
            bschbutton1.setClickProcessData("TABLA-1,TABLA");
            bschbutton1.setDimensions("628,42,100,21");
            bschbutton1.setText("Nova pesquisa");
            panelPadre.add(bschbutton1);
            BSCHTable bschtable = new BSCHTable();
            bschtable.setName("TABLA-1");
            bschtable.setButtonVisible("DOWN");
            bschtable.setStateBar("DOWN");
            bschtable.setDimensions("13,90,617,297");
            bschtable.setDataName("currentRowListDataTABLA");
            bschtable.setDataNameForTable("listDataTABLA");
            bschtable.setNumColumn("6");
            bschtable.setColumn("Bco.;ALPHANUMERIC;CDBCO;50");
            bschtable.setColumn("Nome do banco;ALPHANUMERIC;DSBCO;360");
            bschtable.setColumn("Raiz CNPJ do banco;ALPHANUMERIC;NUCNPJ;130");
            bschtable.setColumn("Data atualiza\347\343o;DATE(/DD/MM/AAAA);DTALTR;100");
            bschtable.setColumn("Hora atualiza\347\343o;ALPHANUMERIC;HRALTR;100");
            bschtable.setColumn("Usu\341rio atualiza\347\343o;ALPHANUMERIC;CDUSUA;115");
            panelPadre.add(bschtable);
            BSCHButton bschbutton2 = new BSCHButton();
            bschbutton2.setName("BORRAR-1");
            bschbutton2.setClickProcess("com.ibm.bsch.client.launcher.ModalWindowOperation");
            bschbutton2.setClickProcessData("BRVR086,TPACES*'I',TFREFRESH*'N',TITLEMODAL*'Inclus\343o de Bancos'");
            bschbutton2.setClickProcessOutData("TFREFRESH");
            bschbutton2.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton2.setClickProcessParameters("LIST,PAGINATION,CONDITION=TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;S");
            bschbutton2.setClickProcessData("VR90,CDBCO");
            bschbutton2.setClickProcessOutData("listDataTABLA*listDataVR90");
            bschbutton2.setDimensions("641,113,100,21");
            bschbutton2.setText("Incluir");
            panelPadre.add(bschbutton2);
            BSCHButton bschbutton3 = new BSCHButton();
            bschbutton3.setName("BORRAR-3");
            bschbutton3.setClickProcess("com.ibm.bsch.client.launcher.LauncherDialog");
            bschbutton3.setClickProcessParameters("MessageID=MSGBRVR00E");
            bschbutton3.setClickProcessData("MSGBRVR00E");
            bschbutton3.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton3.setClickProcessParameters("CONDITION=MSGBRVR00E.BUTTONPRESSED;CONTEXT;ALPHANUMERIC;EQ;VALUE;Sim");
            bschbutton3.setClickProcessData("VR92,TPACES*'E',currentRowListDataTABLA,DTATLZ*currentRowListDataTABLA.DTALTR,HRATLZ*currentRowListDataTABLA.HRALTR");
            bschbutton3.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton3.setClickProcessParameters("LIST,PAGINATION,CONDITION=MSGBRVR00E.BUTTONPRESSED;CONTEXT;ALPHANUMERIC;EQ;VALUE;Sim##BRVR085;LAST_PROCESS_STATUS;BOOLEAN;EQ;VALUE;true");
            bschbutton3.setClickProcessData("VR90,CDBCO*BANCO");
            bschbutton3.setClickProcessOutData("listDataTABLA*listDataVR90");
            bschbutton3.setDimensions("641,167,100,21");
            bschbutton3.setText("Excluir");
            panelPadre.add(bschbutton3);
            BSCHButton bschbutton4 = new BSCHButton();
            bschbutton4.setName("ABANDONAR-1");
            bschbutton4.setButtonType("CancelarIcon");
            bschbutton4.setDimensions("641,423,100,21");
            bschbutton4.setText("Fechar");
            panelPadre.add(bschbutton4);
            BSCHTitledEmbeddedPanel bschtitledembeddedpanel = new BSCHTitledEmbeddedPanel();
            bschtitledembeddedpanel.setName("CAJA-AGRUPACION-1");
            bschtitledembeddedpanel.setText("Dados do banco");
            bschtitledembeddedpanel.setDimensions("11,11,732,68");
            panelPadre.add(bschtitledembeddedpanel);
            BSCHButton bschbutton5 = new BSCHButton();
            bschbutton5.setName("ALT-1");
            bschbutton5.setClickProcess("com.ibm.bsch.client.launcher.ModalWindowOperation");
            bschbutton5.setClickProcessData("BRVR086,currentRowListDataTABLA,DTATLZ*currentRowListDataTABLA.DTALTR,HRATLZ*currentRowListDataTABLA.HRALTR,TFREFRESH*'N',TPACES*'A',TITLEMODAL*'Altera\347\343o de Bancos'");
            bschbutton5.setClickProcessOutData("TFREFRESH");
            bschbutton5.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton5.setClickProcessParameters("LIST(VRM0900),PAGINATION,CONDITION=TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;S");
            bschbutton5.setClickProcessData("VR90,CDBCO*BANCO");
            bschbutton5.setClickProcessOutData("listDataTABLA*listDataVR90");
            bschbutton5.setDimensions("641,140,100,21");
            bschbutton5.setText("Alterar");
            panelPadre.add(bschbutton5);
            BSCHCrossRelation bschcrossrelation = new BSCHCrossRelation();
            bschcrossrelation.setName("Relation1");
            bschcrossrelation.setCondition("TABLA-1;SELECTED_ROW_COUNT;NUMERIC;EQ;VALUE;1");
            bschcrossrelation.setAction("BORRAR-3;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation.setAction("ALT-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation.setElseAction("BORRAR-3;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            bschcrossrelation.setElseAction("ALT-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            panelPadre.add(bschcrossrelation);
            BSCHCrossRelation bschcrossrelation1 = new BSCHCrossRelation();
            bschcrossrelation1.setName("Relation2");
            bschcrossrelation1.setCondition("PESC-1;ISCLICKED;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation1.setAction("PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation1.setAction("L-PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation1.setAction("PESC-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation1.setAction("PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation1.setAction("L-PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation1.setAction("BANCO-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            panelPadre.add(bschcrossrelation1);
            BSCHCrossRelation bschcrossrelation2 = new BSCHCrossRelation();
            bschcrossrelation2.setName("Relation3");
            bschcrossrelation2.setCondition("PESC-2;ISCLICKED;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation2.setAction("PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation2.setAction("L-PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation2.setAction("PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation2.setAction("L-PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation2.setAction("PESC-2;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation2.setAction("BANCO-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation2.setAction("BANCO;CONTEXT;ALPHANUMERIC;EQ;VALUE;NULL");
            bschcrossrelation2.setAction("TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;N");
            panelPadre.add(bschcrossrelation2);
            BSCHCrossRelation bschcrossrelation3 = new BSCHCrossRelation();
            bschcrossrelation3.setName("Relation4");
            bschcrossrelation3.setCondition("TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;S");
            bschcrossrelation3.setAction("BANCO-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            bschcrossrelation3.setAction("PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation3.setAction("L-PESC-2;VISIBLE;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation3.setAction("PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation3.setAction("L-PESC-1;VISIBLE;BOOLEAN;EQ;VALUE;false");
            bschcrossrelation3.setAction("PESC-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation3.setAction("BANCO;CONTEXT;ALPHANUMERIC;EQ;CDBCO;CONTEXT");
            panelPadre.add(bschcrossrelation3);
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

    public void test(){
        System.out.println("TEEEEEEESSST");
    }

    private ClassLoader classLoader;
    private BSCHOperationPanel panelPadre;
}
