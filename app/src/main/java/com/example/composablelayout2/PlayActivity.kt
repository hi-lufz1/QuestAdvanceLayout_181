package com.example.composablelayout2

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(Modifier.padding(10.dp))
        Text(
            text = "Kepada Yth :",
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 15.dp)
        )
        Text(
            text = "Jodi",
            fontSize = 20.sp,
            modifier = Modifier.padding(horizontal = 15.dp)
        )
        Spacer(Modifier.padding(10.dp))
        MainSection("Nama", "Jodi")
        MainSection("Kelas", "ABC")
        MainSection("NIM", "3612789")
        MainSection("Keterangan", "Hadir")
    }
}

@Composable
fun SectionHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
    ) {
        Row(modifier = Modifier.padding(15.dp)) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(id = R.drawable.umy),
                    contentDescription = "", Modifier.size(110.dp)
                )
                Icon(
                    Icons.Filled.Check, contentDescription = "",
                    tint = Color.White
                )
            }
            Column(Modifier.padding(15.dp)) {
                Text(
                    text = "Teknologi Informasi",
                    color = Color.White,
                    fontSize = 24.sp
                )
                Spacer(Modifier.padding(3.dp))
                Text(
                    text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }

        }
    }
}

@Composable
fun MainSection(judulParam: String, isiParam: String) {
    Column(modifier = Modifier.padding(15.dp), horizontalAlignment = Alignment.Start) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = judulParam, fontSize = 20.sp, modifier = Modifier.weight(0.9f))
            Text(text = " : ", fontSize = 20.sp, modifier = Modifier.weight(0.2f))
            Text(text = "$isiParam", fontSize = 20.sp, modifier = Modifier.weight(2f))
        }

    }
}
