package cl.domito.cliente.thread;

import android.os.AsyncTask;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

import cl.domito.cliente.dominio.Usuario;
import cl.domito.cliente.http.Utilidades;

public class CancelarViajeOperation extends AsyncTask<String, Void, Void> {
    @Override
    protected Void doInBackground(String... strings) {
        String url = Utilidades.URL_BASE_SERVICIO + "RemoveServicio.php";
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        Usuario usuario = Usuario.getInstance();
        params.add(new BasicNameValuePair("app", "app"));
        params.add(new BasicNameValuePair("id",usuario.getIdViaje()));
        String idServicio = Utilidades.enviarPost(url,params);
        if(idServicio != null)
        {
            usuario.setIdViaje(null);
            usuario.setBusquedaRealizada(false);
        }
        return null;
    }

}