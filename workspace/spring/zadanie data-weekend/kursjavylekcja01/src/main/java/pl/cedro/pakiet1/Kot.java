package pl.cedro;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Date;

public class Kot {
    private String imieKota;
    private Date dataUrodzeniaKota;
    private Float wagaKota;
    private String imieOpiekunaKota;

    public String przedstawSię(){
        return  "Kot nazywa się "+imieKota+" urodził się " + dataUrodzeniaKota
                +" waży " + wagaKota+ ", a jego opiekun to: " +imieOpiekunaKota+"." ;
    }

    public String getImieKota() {
        return imieKota;
    }

    public void setImieKota(String imieKota) {
        this.imieKota = imieKota;
    }

    public Date getDataUrodzeniaKota() {
        return dataUrodzeniaKota;
    }

    public void setDataUrodzeniaKota(Date dataUrodzeniaKota) {
        this.dataUrodzeniaKota = dataUrodzeniaKota;
    }

    public Float getWagaKota() {
        return wagaKota;
    }

    public void setWagaKota(Float wagaKota) {
        this.wagaKota = wagaKota;
    }

    public String getImieOpiekunaKota() {
        return imieOpiekunaKota;
    }

    public void setImieOpiekunaKota(String imieOpiekunaKota) {
        this.imieOpiekunaKota = imieOpiekunaKota;
    }
}
