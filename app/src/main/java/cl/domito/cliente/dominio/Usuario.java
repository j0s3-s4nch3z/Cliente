package cl.domito.cliente.dominio;

import android.location.Location;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Usuario {

    private static Usuario instance;

    public static int SELECCIONAR_UBICACION = 0;
    public static int SELECCIONAR_PLACES = 1;
    public static int SELECCIONAR_MAPA = 2;

    public static int DESCONECTADO = 0;
    public static int CONECTADO = 1;

    private String id;
    private String nombre;
    private String nick;
    private String password;
    private String cliente;
    private String celular;
    private String direccion;
    private String mail;
    private boolean activo;
    private boolean recordarSession;
    private boolean buscaServicio;
    private String placeIdOrigen;
    private Map<String,String> placeIdDestino = new HashMap();
    private boolean conectado;
    private int tipoBusqueda;
    private boolean busquedaRealizada;
    private String idViaje;
    private List<LatLng> latLngs;
    private int cantidadDestinos = 1;
    private View editTextCompletar;
    private LatLng ubicacion;
    private boolean enProceso;
    private JSONObject datosConductor;
    private float distanciaConductor;
    private Location location;

    public static synchronized Usuario getInstance(){
        if(instance == null){
            instance = new Usuario();
        }
        return instance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
}

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isRecordarSession() {
        return recordarSession;
    }

    public void setRecordarSession(boolean recordarSession) {
        this.recordarSession = recordarSession;
    }

    public boolean isBuscaServicio() {
        return buscaServicio;
    }

    public void setBuscaServicio(boolean buscaServicio) {
        this.buscaServicio = buscaServicio;
    }

    public String getPlaceIdOrigen() {
        return placeIdOrigen;
    }

    public void setPlaceIdOrigen(String placeIdOrigen) {
        this.placeIdOrigen = placeIdOrigen;
    }

    public Map<String,String> getPlaceIdDestino() {
        return placeIdDestino;
    }

    public void setPlaceIdDestino(Map<String,String> placeIdDestino) {
        this.placeIdDestino = placeIdDestino;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public int getTipoBusqueda() {
        return tipoBusqueda;
    }

    public void setTipoBusqueda(int tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
    }

    public boolean isBusquedaRealizada() {
        return busquedaRealizada;
    }

    public void setBusquedaRealizada(boolean busquedaRealizada) {
        this.busquedaRealizada = busquedaRealizada;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public List<LatLng> getLatLngs() {
        return latLngs;
    }

    public void setLatLngs(List<LatLng> latLngs) {
        this.latLngs = latLngs;
    }

    public int getCantidadDestinos() {
        return cantidadDestinos;
    }

    public void setCantidadDestinos(int cantidadDestinos) {
        this.cantidadDestinos = cantidadDestinos;
    }

    public View getEditTextCompletar() {
        return editTextCompletar;
    }

    public void setEditTextCompletar(View editTextCompletar) {
        this.editTextCompletar = editTextCompletar;
    }

    public LatLng getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(LatLng ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEnProceso() {
        return enProceso;
    }

    public void setEnProceso(boolean enProceso) {
        this.enProceso = enProceso;
    }

    public JSONObject getDatosConductor() {
        return datosConductor;
    }

    public void setDatosConductor(JSONObject datosConductor) {
        this.datosConductor = datosConductor;
    }

    public float getDistanciaConductor() {
        return distanciaConductor;
    }

    public void setDistanciaConductor(float distanciaConductor) {
        this.distanciaConductor = distanciaConductor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
