import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class JSONManager {

    JSONManager(){}

    public static void main(String[] args){
        JSONManager manager = new JSONManager();

        JSONObject a = manager.reader(manager.write(1,1,1,1));


        System.out.println(manager.reader(manager.writeBoolean("True")));


    }

    //PARA MANDAR COORDENADAS DE LINEAS ---- CLIENTE -----
    @SuppressWarnings("unchecked")
    public String write(int x1, int y1, int x2, int y2){

        JSONObject obj = new JSONObject();

        obj.put("x1", x1);
        obj.put("y1", y1);
        obj.put("x2", x2);
        obj.put("y2", y2);


        String out = obj.toString();

        return out;

    }

    // MANDAR BOOLEANS AL CLIENTE SOBRE LINEA PERMITIDA ----- SERVIDOR -----
    public String writeBoolean(String bool){

        JSONObject obj = new JSONObject();

        obj.put("Condition:", bool);

        String out = obj.toString();

        return out;

    }


    // READER FOR ALL
    public JSONObject reader(String line){
        JSONParser parser = new JSONParser();

        Object obj;
        try {
            obj = parser.parse(line);
            JSONObject newJSON = (JSONObject) obj;

            return newJSON;

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;




    }
}