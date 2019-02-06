package com.ibm.bsch.client.bmlclasses;

import com.ibm.dse.gui.extensions.*;

public class BRVR086 {

    public BRVR086() {
        panelPadre = new BSCHOperationPanel();
    }

    public void setClassLoader(ClassLoader classloader) {
        classLoader = classloader;
    }

    public BSCHOperationPanel exec() {
        try {
            panelPadre.setOperationName("dummyOp");
            panelPadre.setName("BRVR086");
            panelPadre.setTitle("Inclus\343o de Banco");
            panelPadre.setDimensions("0,0,500,165,C,C");
            panelPadre.setProcessParameters("GLOBAL(DTATLZ1*VGFECHADIA),GLOBAL(HRATLZ1*_TF_stateData.HORA_ACTUAL(1-5)),GLOBAL(CDUSUA1*VGUSER)");
            panelPadre.setPreViewAction("com.ibm.bsch.client.launcher.LauncherCrossRelationByName");
            panelPadre.setPreViewData("Relation3,Relation4");
            BSCHLabel bschlabel = new BSCHLabel();
            bschlabel.setName("L-DSBCO-1");
            bschlabel.setText("Nome do banco");
            bschlabel.setDimensions("86,32,85,15");
            bschlabel.setBehaviour("RDONLY");
            panelPadre.add(bschlabel);
            BSCHTextField bschtextfield = new BSCHTextField();
            bschtextfield.setName("DSBCO-1");
            bschtextfield.setDataName("DSBCO");
            bschtextfield.setBehaviour("RDONLY");
            bschtextfield.setType("ALPHANUMERIC");
            bschtextfield.setMaxChars(40);
            bschtextfield.setDimensions("86,49,257,16");
            panelPadre.add(bschtextfield);
            BSCHLabel bschlabel1 = new BSCHLabel();
            bschlabel1.setName("L-NUCNPJ-2");
            bschlabel1.setText("CNPJ raiz");
            bschlabel1.setDimensions("354,32,51,15");
            bschlabel1.setBehaviour("IREQ");
            panelPadre.add(bschlabel1);
            BSCHTextField bschtextfield1 = new BSCHTextField();
            bschtextfield1.setName("NUCNPJ-2");
            bschtextfield1.setDataName("NUCNPJ");
            bschtextfield1.setBehaviour("IREQ");
            bschtextfield1.setType("FILLED");
            bschtextfield1.setMaxChars(8);
            bschtextfield1.setDimensions("354,49,115,16");
            panelPadre.add(bschtextfield1);
            BSCHLabel bschlabel2 = new BSCHLabel();
            bschlabel2.setName("L-DTATLZ-3");
            bschlabel2.setText("Data atualiza\347\343o");
            bschlabel2.setDimensions("25,74,86,15");
            bschlabel2.setBehaviour("RDONLY");
            panelPadre.add(bschlabel2);
            BSCHTextField bschtextfield2 = new BSCHTextField();
            bschtextfield2.setName("DTATLZ-3");
            bschtextfield2.setDataName("DTATLZ");
            bschtextfield2.setBehaviour("RDONLY");
            bschtextfield2.setType("DATE");
            bschtextfield2.setMaxChars(10);
            bschtextfield2.setMask("/DD/MM/AAAA");
            bschtextfield2.setDimensions("25,91,90,16");
            bschtextfield2.setHorizAlignment("RIGHT");
            panelPadre.add(bschtextfield2);
            BSCHLabel bschlabel3 = new BSCHLabel();
            bschlabel3.setName("L-HRATLZ-4");
            bschlabel3.setText("Hora atualiza\347\343o");
            bschlabel3.setDimensions("126,74,88,15");
            bschlabel3.setBehaviour("RDONLY");
            panelPadre.add(bschlabel3);
            BSCHTextField bschtextfield3 = new BSCHTextField();
            bschtextfield3.setName("HRATLZ-4");
            bschtextfield3.setDataName("HRATLZ");
            bschtextfield3.setBehaviour("RDONLY");
            bschtextfield3.setType("ALPHANUMERIC");
            bschtextfield3.setMaxChars(5);
            bschtextfield3.setDimensions("126,91,89,16");
            panelPadre.add(bschtextfield3);
            BSCHLabel bschlabel4 = new BSCHLabel();
            bschlabel4.setName("L-CDUSUA-5");
            bschlabel4.setText("Usu\341rio atualiza\347\343o");
            bschlabel4.setDimensions("226,74,105,15");
            bschlabel4.setBehaviour("RDONLY");
            panelPadre.add(bschlabel4);
            BSCHTextField bschtextfield4 = new BSCHTextField();
            bschtextfield4.setName("CDUSUA-5");
            bschtextfield4.setDataName("CDUSUA");
            bschtextfield4.setBehaviour("RDONLY");
            bschtextfield4.setType("ALPHANUMERIC");
            bschtextfield4.setMaxChars(8);
            bschtextfield4.setDimensions("226,91,104,16");
            panelPadre.add(bschtextfield4);
            BSCHTitledEmbeddedPanel bschtitledembeddedpanel = new BSCHTitledEmbeddedPanel();
            bschtitledembeddedpanel.setName("CAJA-AGRUPACION-1");
            bschtitledembeddedpanel.setText("Dados do banco");
            bschtitledembeddedpanel.setDimensions("11,11,473,110");
            panelPadre.add(bschtitledembeddedpanel);
            BSCHButton bschbutton = new BSCHButton();
            bschbutton.setName("ACEPTAR-1");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbutton.setClickProcessData("VR92,TPACES,CDBCO(4-1)[0],DSBCO,NUCNPJ,DTATLZ*DTATLZ1,HRATLZ*HRATLZ1,CDUSUA*CDUSUA1");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.LauncherCrossRelationByName");
            bschbutton.setClickProcessParameters("CONDITION=BRVR086;LAST_PROCESS_STATUS;BOOLEAN;EQ;VALUE;true");
            bschbutton.setClickProcessData("Relation1");
            bschbutton.setClickProcess("com.ibm.bsch.client.launcher.ClosePanelAndHisProcesses");
            bschbutton.setClickProcessParameters("CONDITION=TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;S");
            bschbutton.setBehaviour("RDONLY");
            bschbutton.setDimensions("276,130,100,21");
            bschbutton.setText("Ok");
            bschbutton.setIconFile("aceptar.gif");
            panelPadre.add(bschbutton);
            BSCHButton bschbutton1 = new BSCHButton();
            bschbutton1.setName("ABANDONAR-1");
            bschbutton1.setButtonType("Abandonar");
            bschbutton1.setDimensions("382,130,100,21");
            bschbutton1.setText("Cancelar");
            bschbutton1.setIconFile("cancelar.gif");
            panelPadre.add(bschbutton1);
            BSCHLabel bschlabel5 = new BSCHLabel();
            bschlabel5.setName("L-CDBCO-7");
            bschlabel5.setText("Bco.");
            bschlabel5.setDimensions("25,31,23,16");
            bschlabel5.setBehaviour("IREQ");
            panelPadre.add(bschlabel5);
            BSCHButtonTextField bschbuttontextfield = new BSCHButtonTextField();
            bschbuttontextfield.setName("CDBCO-7");
            bschbuttontextfield.setClickProcess("com.ibm.bsch.client.launcher.ModalWindowOperation");
            bschbuttontextfield.setClickProcessData("BRVR087");
            bschbuttontextfield.setClickProcessOutData("CDBCO*currentRowListDataTABLA.STBANCO,DSBCO*currentRowListDataTABLA.NBBAN");
            bschbuttontextfield.setClickProcess("com.ibm.bsch.client.launcher.ExecuteTransaction");
            bschbuttontextfield.setClickProcessData("VR10,CDBCO*CDBCO(4-1)[0]");
            bschbuttontextfield.setClickProcessOutData("NUCNPJ");
            bschbuttontextfield.setClickProcess("com.ibm.bsch.client.launcher.LauncherCrossRelationByName");
            bschbuttontextfield.setClickProcessData("Relation3");
            bschbuttontextfield.setDataName("CDBCO");
            bschbuttontextfield.setType("FILLED");
            bschbuttontextfield.setBehaviour("IREQ");
            bschbuttontextfield.setDimensions("25,48,60,16");
            bschbuttontextfield.setMaxChars("4");
            panelPadre.add(bschbuttontextfield);
            BSCHCrossRelation bschcrossrelation = new BSCHCrossRelation();
            bschcrossrelation.setName("Relation1");
            bschcrossrelation.setCondition("ACEPTAR-1;ISCLICKED;BOOLEAN;EQ;VALUE;true");
            bschcrossrelation.setAction("TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;S");
            bschcrossrelation.setElseAction("TFREFRESH;CONTEXT;ALPHANUMERIC;EQ;VALUE;N");
            panelPadre.add(bschcrossrelation);
            BSCHCrossRelation bschcrossrelation1 = new BSCHCrossRelation();
            bschcrossrelation1.setName("Relation2");
            bschcrossrelation1.setCondition("TPACES;CONTEXT;ALPHANUMERIC;EQ;VALUE;I");
            bschcrossrelation1.setAction("DTATLZ;CONTEXT;ALPHANUMERIC;EQ;DTATLZ1;CONTEXT");
            bschcrossrelation1.setAction("HRATLZ;CONTEXT;ALPHANUMERIC;EQ;HRATLZ1;CONTEXT");
            bschcrossrelation1.setAction("CDUSUA;CONTEXT;ALPHANUMERIC;EQ;CDUSUA1;CONTEXT");
            bschcrossrelation1.setAction("NUCNPJ-2;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            bschcrossrelation1.setAction("CDBCO-7;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;IREQ");
            panelPadre.add(bschcrossrelation1);
            BSCHCrossRelation bschcrossrelation2 = new BSCHCrossRelation();
            bschcrossrelation2.setName("Relation3");
            bschcrossrelation2.setCondition("DTATLZ;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setCondition("HRATLZ;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setCondition("CDUSUA;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setCondition("CDBCO;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setCondition("DSBCO;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setCondition("NUCNPJ;CONTEXT;ALPHANUMERIC;NE;VALUE;NULL");
            bschcrossrelation2.setAction("ACEPTAR-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;OPT");
            bschcrossrelation2.setElseAction("ACEPTAR-1;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
            panelPadre.add(bschcrossrelation2);
            BSCHCrossRelation bschcrossrelation3 = new BSCHCrossRelation();
            bschcrossrelation3.setName("Relation4");
            bschcrossrelation3.setCondition("TPACES;CONTEXT;ALPHANUMERIC;EQ;VALUE;A");
            bschcrossrelation3.setAction("NUCNPJ-2;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;IREQ");
            bschcrossrelation3.setAction("CDBCO-7;BEHAVIOUR;ALPHANUMERIC;EQ;VALUE;RDONLY");
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

    private ClassLoader classLoader;
    private BSCHOperationPanel panelPadre;
}
