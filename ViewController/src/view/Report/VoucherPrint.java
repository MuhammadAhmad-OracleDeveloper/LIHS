package view.Report;

import javax.faces.event.ActionEvent;

import view.DatabaseConnection.DatabaseConnection;

public class VoucherPrint {
    public VoucherPrint() {
    }
    DatabaseConnection dbconnect = new DatabaseConnection();
    OracleReportBean reportBean = new OracleReportBean(dbconnect.getUipReport(), dbconnect.getUportReport(), null);
    
    public void getDOReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendDOID = (Number) actionEvent.getComponent().getAttributes().get("sendDOID");
        reportBean.setReportParameter("P_DOMID", sendDOID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Demand_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void GetPOReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendPOID = (Number) actionEvent.getComponent().getAttributes().get("sendPOID");
        reportBean.setReportParameter("P_POMID", sendPOID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Purchase_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getIGPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendIGPID = (Number) actionEvent.getComponent().getAttributes().get("sendIGPID");
        reportBean.setReportParameter("P_IGPMID", sendIGPID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Inward_Gate_Pass_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getQCRReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendQCRID = (Number) actionEvent.getComponent().getAttributes().get("sendQCRID");
        reportBean.setReportParameter("P_QCRID", sendQCRID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Quality_Inspection_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGRNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendGRNID = (Number) actionEvent.getComponent().getAttributes().get("sendGRNID");
        reportBean.setReportParameter("P_GRNMID", sendGRNID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Good_Receipt_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
    

    public void GetCPReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendCPID = (Number) actionEvent.getComponent().getAttributes().get("sendCPID");
        reportBean.setReportParameter("P_CPID", sendCPID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Cash_Purchse_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getDNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendDNID = (Number) actionEvent.getComponent().getAttributes().get("sendDNID");
        reportBean.setReportParameter("P_DNMID", sendDNID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Debit_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getGINReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendGINID = (Number) actionEvent.getComponent().getAttributes().get("sendGINID");
        reportBean.setReportParameter("P_GINMID", sendGINID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Good_Issue_Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getITNReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendITNMID = (Number) actionEvent.getComponent().getAttributes().get("sendITNMID");
        reportBean.setReportParameter("P_ITNMID", sendITNMID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Inter_Transfer__Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void getCOAReport(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Chart_of_Account_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_BOQ_Report(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendBOQID = (Number) actionEvent.getComponent().getAttributes().get("sendBOQID");
        reportBean.setReportParameter("P_Boq_M_id", sendBOQID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Inter_Transfer__Notes_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_FGT_Report(ActionEvent actionEvent) {
        // Add event code here...
        String url = "";
        Number sendFGTID = (Number) actionEvent.getComponent().getAttributes().get("sendFGTID");
        reportBean.setReportParameter("P_Fgt_M_id", sendFGTID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Finish_Goods_Transfer_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_KM_Report(ActionEvent actionEvent) {
        // Add event code here...

        String url = "";
        Number sendKMMID = (Number) actionEvent.getComponent().getAttributes().get("sendKMMID");
        reportBean.setReportParameter("P_Kichen_Menu_M_id", sendKMMID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Kichen_Menu_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_PFG_Report(ActionEvent actionEvent) {
        // Add event code here...

        String url = "";
        Number sendPFGMID = (Number) actionEvent.getComponent().getAttributes().get("sendPFGMID");
        reportBean.setReportParameter("P_Pro_Fg_M_id", sendPFGMID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Production_Finish_Goods_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_PI_Report(ActionEvent actionEvent) {
        // Add event code here...

        String url = "";
        Number sendPIMID = (Number) actionEvent.getComponent().getAttributes().get("sendPIMID");
        reportBean.setReportParameter("P_Pro_Iss_M_id", sendPIMID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Production_Issuance_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }

    public void get_PO_Report(ActionEvent actionEvent) {
        // Add event code here...

        String url = "";
        Number sendPORMID = (Number) actionEvent.getComponent().getAttributes().get("sendPORMID");
        reportBean.setReportParameter("P_Por_M_id", sendPORMID.toString());
        
        reportBean.setReportURLName("userid=lihs/lihs@orcl&domain=classicdomain&report=C:/LIHS_Reports/Production_Order_Detail&");
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESTYPE,
                                        "CACHE"); // which will be one of the [cashe - file - mail - printer]
        reportBean.setReportServerParam(OracleReportBean.RS_PARAM_DESFORMAT,
                                        "PDF"); // Which will be onr of the [HTML - HTML CSS - PDF - SPREADSHEET- RTF].
        reportBean.setReportParameter("paramform", "no");

        url = reportBean.getReportServerURL();
        System.out.println("Url => " + url);
        reportBean.openUrlInNewWindow(url);
    }
}
