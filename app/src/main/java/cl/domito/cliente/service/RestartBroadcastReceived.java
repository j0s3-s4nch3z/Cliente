package cl.domito.cliente.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import cl.domito.cliente.dominio.Usuario;

public class RestartBroadcastReceived extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(RestartBroadcastReceived.class.getSimpleName(), "Service Stops! Oooooooooooooppppssssss!!!!");
        context.startService(new Intent(context, SolicitarViajeService.class)
                .putExtra("idServicio", Usuario.getInstance().getIdViaje()));
    }
}
