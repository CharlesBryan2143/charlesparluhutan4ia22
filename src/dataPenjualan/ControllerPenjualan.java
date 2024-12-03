package dataPenjualan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerPenjualan {
    ArrayList<ModelPenjualan>ArrayData;
    DefaultTableModel tablelist;
    private DefaultTableModel tableModel;
    
    public ControllerPenjualan(){
        ArrayData = new ArrayList<ModelPenjualan>();
    }
    
    public void InsertData(String item, String Deskripsigame, int HargaAkun, boolean StokTerseida){
        ModelPenjualan pjn = new ModelPenjualan(item, Deskripsigame, HargaAkun, StokTerseida);
        ArrayData.add(pjn);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"ITEM", "deskripsigame", "hargaAkun", "Stoktersedia"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;
        
        for(ModelPenjualan n : ArrayData){
            String[] arrData = {n.getITEM(), n.getDeskripsiGame(), String.valueOf(n.getHargaakun()), String.valueOf(n.StokakunTerseida())};
            objData[i] = arrData;
            i++;
        }
        
        tableModel = new DefaultTableModel(objData,kolom){
            public boolean isCellEditTable(int rowIndex, int colIndex){
                return false;
            }
        };
        
        return tableModel;
        
    }
}
