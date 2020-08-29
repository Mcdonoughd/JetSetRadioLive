package com.jetsetradio.live.data

class Station(private val StationName: String,
              private val StationColor: String,
              private val StationIcon: Int,
              private val StationDesc: Int,
              private val stationBackground: Int){

    fun getStationName():String{
        return this.StationName
    }

    // TODO remove this
    fun getStationColor():String{
        return this.StationColor
    }

    fun getStationDesc():Int{
        return this.StationDesc
    }

    fun getStationIcon():Int{
        return this.StationIcon
    }

    fun getStationBackground():Int{
        return this.stationBackground
    }

    fun getStationSliderData(): IntArray {
        return intArrayOf(this.StationIcon,this.StationDesc)
    }

}