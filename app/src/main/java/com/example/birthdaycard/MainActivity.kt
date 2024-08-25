package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier
                        .padding(16.dp)
                        .background(Color.Blue)
                )
                {

                }
            }
        }
    }
}


@Composable
fun BirthdayCard(
    modifier: Modifier = Modifier,
    message: String,
    giver: String,
    message2: String,
    message3: String,
    message4: String
) {
    val image = painterResource(id = R.drawable.backgroundimage)
    Box(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()){
        Image(
            painter = image,
            contentDescription = "null",contentScale = ContentScale.Crop,
            alpha = 0.9F
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "$message",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.padding(vertical = 2.dp))
        Text(
            text = "$message2",
            fontSize = 40.sp, color = Color.Red,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.padding(vertical = 2.dp))
        Text(
            text = "$message3",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = "$message4",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        Text(
            text = "From $giver",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun BirthdayCardPreview() {
    BirthdayCardTheme {
        BirthdayCard(
            message = "Happy Birthday!!",
            giver = "Richa",
            message2 = "Lord Ayush Upadhyay",
            message3 = "God always Bless you",
            message4 = "🎂🥳🎈🎉"
        )
    }
}