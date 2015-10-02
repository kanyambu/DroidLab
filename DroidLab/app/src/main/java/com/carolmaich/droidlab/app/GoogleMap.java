package com.carolmaich.droidlab.app;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Student on 02/10/2015.
 */
public interface GoogleMap {


  public   void addMarker(MarkerOptions markerOption);

    public void setMyLocationEnabled(boolean b);

    public void animateCamera(CameraUpdate cameraUpdate);


}
