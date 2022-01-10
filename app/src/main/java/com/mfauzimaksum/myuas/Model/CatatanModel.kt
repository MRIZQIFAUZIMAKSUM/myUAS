package com.mfauzimaksum.myuas.Model

class CatatanModel (
    val sekolah: List<Data>
) {
    data class Data (val namasekolah:String?, val alamatsekolah:String?)
}