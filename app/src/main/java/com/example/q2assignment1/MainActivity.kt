package com.example.q2assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.q2assignment1.ui.theme.Q2Assignment1Theme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Q2Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    WeatherImage()
                    LocationsApp()
                }

            }
        }
    }
}



@Composable
fun WeatherImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.weather)
    //Step 3 create a box to overlap image and texts
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = "background image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize(),
        )
        Surface(
            color = Color.Transparent
        ) {
            Column {
                Row {
                    Row(
                        modifier = Modifier.weight(2.5f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = "menu icon",
                            modifier = Modifier
                                .width(70.dp)
                                .padding(20.dp)
                        )
                        Text(
                            text = "MUMBAI",
                            modifier = Modifier.padding(vertical = 20.dp),
                            color = Color(0xFF7098EA),
                            fontSize = 20.sp
                        )
                    }
                    Spacer(modifier = Modifier.weight(1.3f))
                    Row(
                        modifier = Modifier.weight(1f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "search icon",
                            modifier = Modifier
                                .width(20.dp)
                                .padding(vertical = 25.dp)
                        )

                        Image(
                            painter = painterResource(id = R.drawable.wrench),
                            contentDescription = "settings icon",
                            modifier = Modifier
                                .width(55.dp)
                                .padding(vertical = 24.dp, horizontal = 17.dp)
                        )
                    }

                }
                Row(
                    modifier = Modifier.padding(vertical = 20.dp, horizontal = 20.dp)
                ){
                    Row(modifier = Modifier.weight(1f)) {
                        Text(text = "28", color = Color.White, fontSize = 100.sp)
                    }
                    Column(modifier  = Modifier.weight(1f)) {
                        Row {

                            Text(text = "°C", color = Color(0xFF7098ea), fontSize = 25.sp, modifier = Modifier.padding(vertical = 22.dp))
                        }
                        Row(modifier = Modifier.padding(vertical = 0.dp)) {
                            Text(text = "SUNNY", color  =Color(0xFF7098ea),  fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                    Column(modifier = Modifier
                        .weight((1f))
                        .padding(vertical = 30.dp, horizontal = 5.dp)) {
                        Text(text = "23 OCT, MON", color = Color.White, fontSize = 17.sp)
                        Text(text = "20:53 PM", color = Color.White, textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp), fontSize = 20.sp)

                    }
                }
            }
        }
        Surface (
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .align(Alignment.BottomCenter)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                    Text(text = "SAT", fontSize = 25.sp, color = Color(0xFFf891c0))
                    Image(painter = painterResource(id = R.drawable.cloud_pink), contentDescription = "pink cloud", modifier = Modifier.width(50.dp) )
                    Text(text = "28", fontSize = 25.sp, color = Color(0xFFf891c0))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                    Text(text = "SUN", fontSize = 25.sp, color = Color(0xFF9392ab))
                    Image(painter = painterResource(id = R.drawable.sun), contentDescription = "pink cloud", modifier = Modifier.width(50.dp) )
                    Text(text = "31", fontSize = 25.sp, color = Color(0xFF9392ab))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                    Text(text = "MON", fontSize = 25.sp, color = Color(0xFF9392ab))
                    Image(painter = painterResource(id = R.drawable.partly_cloudy), contentDescription = "pink cloud", modifier = Modifier.width(50.dp) )
                    Text(text = "31", fontSize = 25.sp, color = Color(0xFF9392ab))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                    Text(text = "TUE", fontSize = 25.sp, color = Color(0xFF9392ab))
                    Image(painter = painterResource(id = R.drawable.sun), contentDescription = "pink cloud", modifier = Modifier.width(50.dp) )
                    Text(text = "32", fontSize = 25.sp, color = Color(0xFF9392ab))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
                    Text(text = "WED", fontSize = 25.sp, color = Color(0xFF9392ab))
                    Image(painter = painterResource(id = R.drawable.cloud), contentDescription = "pink cloud", modifier = Modifier.width(50.dp) )
                    Text(text = "32", fontSize = 25.sp, color = Color(0xFF9392ab))
                }
            }
        }

    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Any) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Q2Assignment1Theme {
        WeatherImage()
    }
}