package com.example.pahlawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pahlawan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pahlawan = mutableListOf<Pahlawans>(
            Pahlawans("Thomas Matulessy","8 Juni 1783","Ambon",R.drawable.patimura,"Nama asli Kapitan Pattimura adalah Thomas Matulessy. Ia mengikuti pendidikan militer saat Inggris berkuasa di Maluku dan meraih pangkat sersan mayor. Namun, Maluku berhasil diduduki kembali oleh kolonial Belanda"),
            Pahlawans("Pangeran Antasari","1797","Banjar",R.drawable.antasari,"Pangeran Antasari menjalankan penyerangan terhadap kolonial bersama rakyat Banjarmasin dimulai saat Belanda mengangkat Tamjidillah sebagai Sultan Banjar menggantikan Sultan Adam yang wafat"),
            Pahlawans("Pangeran Diponegoro","11 November 1785","Yogyakarta",R.drawable.diponegoro,"Pangeran Diponegoro memulai perlawanan saat Belanda merencanakan pembangunan jalan dengan memasang tiang-tiang melewati rumah, masjid, dan makam leluhurnya. Ia dengan berani mencabut tiang penghalang itu. Akibatnya, pasukan kolonial menyerang kediaman Pangeran Diponegoro"),
            Pahlawans("Sisingamangaraja XII","18 Februari 1845","Sumatera",R.drawable.sisingamangaraja,"Sisingamangaraja XII mulai melakukan penyerangan terhadap kolonial untuk mempertahankan daerah kekuasaannya di Tapanuli, Sumatera Utara yang diduduki Belanda"),
            Pahlawans("Sultan Hasanudin","12 Januari 1631","Makasar",R.drawable.hasanudin,"Sultan Hasanudin mengawali serangan terhadap kolonial pada tahun 1660. Kala itu, Belanda dibantu oleh Kerajaan Bone yang merupakan kerajaan taklukan dari Kerajaan Gowa. Perang itu pun diakhiri dengan perdamaian"),
        )

        val adapter = PahlawanAdapter(pahlawan)

        with(binding) {
            recycler.adapter = adapter
            recycler.layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }
}