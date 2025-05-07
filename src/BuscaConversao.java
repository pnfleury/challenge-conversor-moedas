import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscaConversao {

    public Moeda buscaconversao(Double valor, String base_code, String target_code) throws IOException {
            String url_str = "https://v6.exchangerate-api.com/v6/24d2292d9d1eeca3643cfee1/pair/" + base_code + "/" + target_code + "/" + valor;
            // Making Request
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();
            // Convert to JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();
            return new Gson().fromJson(jsonobj.getAsJsonObject(), Moeda.class);
    }
}
