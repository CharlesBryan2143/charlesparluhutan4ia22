/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataPenjualan;

public class ModelPenjualan{

    private String item;
    private String Deskripsigame;
    private int HargaAkun;
    private boolean StokTerseida;
    
    public ModelPenjualan(String item, String Deskripsigame, int HargaAkun, boolean StokTerseida){
        this.item = item;
        this.Deskripsigame = Deskripsigame;
        this.HargaAkun = HargaAkun;
        this.StokTerseida = StokTerseida;
    }
    
    public String getITEM(){
        return item;
    }
    
    public String getDeskripsiGame(){
        return Deskripsigame;
    }
    
    public void setDeskripsiGame(String Deskripsigame){
        this.Deskripsigame = Deskripsigame;
    }
    
    public int getHargaakun(){
        return HargaAkun;
    }
    
    public void setHargaakun(int HargaAkun){
        this.HargaAkun = HargaAkun;
    }
    
    public boolean StokakunTerseida(){
        return StokTerseida;
    }
    
    public void setStokTerseida(boolean StokTerseida){
        this.StokTerseida = StokTerseida;
    }
    
}
