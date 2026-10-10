package com.example.tugas3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Activitas2(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))

        KartuMahasiswa(
            nama = stringResource(R.string.nama_0),
            telepon = null,
            alamat = stringResource(R.string.alamat_0),
            warnaCard = colorResource(R.color.card_0_bg),
            warnaTelepon = colorResource(R.color.telepon_cyan),
            warnaAlamat = colorResource(R.color.yellow),
            fontNama = FontFamily.Cursive,
            beratNama = FontWeight.Normal
        )

        KartuMahasiswa(
            nama = stringResource(R.string.nama_1),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_1),
            warnaCard = colorResource(R.color.card_1_bg),
            warnaTelepon = colorResource(R.color.telepon_cyan),
            warnaAlamat = colorResource(R.color.yellow)
        )

        KartuMahasiswa(
            nama = stringResource(R.string.nama_2),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_2),
            warnaCard = colorResource(R.color.card_2_bg),
            warnaTelepon = colorResource(R.color.telepon_aqua),
            warnaAlamat = colorResource(R.color.white)
        )

        KartuMahasiswa(
            nama = stringResource(R.string.nama_3),
            telepon = stringResource(R.string.telepon),
            alamat = stringResource(R.string.alamat_3),
            warnaCard = colorResource(R.color.card_3_bg),
            warnaTelepon = colorResource(R.color.telepon_aqua),
            warnaAlamat = colorResource(R.color.white)
        )
    }
}

@Composable
fun KartuMahasiswa(
    nama: String,
    telepon: String?,
    alamat: String,
    warnaCard: Color,
    warnaTelepon: Color,
    warnaAlamat: Color,
    fontNama: FontFamily = FontFamily.Default,
    beratNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = warnaCard)
    ) {
        Row(
            modifier = Modifier.padding(vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(5.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
