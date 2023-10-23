package com.example.q2assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.q2assignment1.ui.theme.Q2Assignment1Theme

class LocationsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Q2Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LocationsApp()
                }
            }
        }
    }
}


@Composable
fun LocationsApp(modifier: Modifier = Modifier) {
    Column{

        Row(modifier = Modifier.weight(1.5f)) {
            Column(modifier = Modifier
                .weight(1.5f)
                .padding(20.dp)) {
//            {
                Row {

                    Image(painter = painterResource(id = R.drawable.back), contentDescription = null, modifier = Modifier
                        .width(18.dp)
                    )
                    Text(text = "LOCATIONS", color = Color(0xFF82829e), fontWeight = FontWeight.Bold, fontSize = 18.sp, modifier = Modifier.padding(start = 10.dp))
                    Spacer(modifier = Modifier.weight(0.01f))
                    Image(painter = painterResource(id = R.drawable.more), contentDescription = null, modifier = Modifier
                        .width(20.dp))
                }
                Row (modifier = Modifier.padding(top=50.dp)){
                    Text(buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color(0xFF9392ab))){
                            append("You are currently getting results for popular places in ")
                        }
                        withStyle(style = SpanStyle(color = Color(0xFFf891c0))){
                            append("Pakistan")
                        }
                    },
                        fontWeight = FontWeight.Bold)
                }
                ChooseButton()
            }
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFFF0F0F9)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                Image(painter = painterResource(id = R.drawable.add), contentDescription = null,modifier = Modifier
                    .width(20.dp)
                    .padding(vertical = 20.dp) )
                Text(text = "ADD PLACE", color = Color(0xFF82829e), fontWeight = FontWeight.ExtraBold, fontSize = 18.sp,)
            }
        }
        Row(modifier = Modifier.weight(2f).fillMaxWidth()) {
            Column {

                LocationCard(city = "Lahore", humidity = "51", temp = "28", weather = "Sunny", selected = true)
                LocationCard(city = "Karachi", humidity = "40", temp = "24", weather = "Clear", selected = false)
                LocationCard(city = "Islamabad", humidity = "30", temp = "15", weather = "Smoke", selected = false)
            }

        }
    }
}


@Composable
fun ChooseButton(){
    Button(
        onClick = {} ,
        colors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFFF0F0F9),
        contentColor = Color(0xFF666acc)
    ),
        shape = RoundedCornerShape(20.dp), // Adjust the corner radius as needed
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .padding(top = 40.dp)
    ) {
        Text(
            text = "Choose Place",
            fontWeight = FontWeight.Bold // Set the text style
        )
    }
}

@Composable
fun LocationCard(city:String, humidity:String, temp:String,weather:String, selected:Boolean) {
    val backgroundColor = if(selected) Color(0xFF666acc) else Color.White
    val cityColor = if(selected) Color.White else Color(0xFF626188)
    val tempColor = if (selected) Color(0xFFf891c0) else Color(0xFF666acc)

    Column(modifier = Modifier.fillMaxWidth().background(backgroundColor).padding(20.dp)) {
        Row {
            Column(modifier = Modifier.weight(3f)) {

                Text(text = city, color = cityColor, fontSize = 24.sp)
                Text(text = "Humidity: $humidity%", color = Color(0xFF82829e), fontSize = 17.sp)
            }
            Column(modifier = Modifier.weight(1.5f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
                Text(text = "$temp, $weather", color = tempColor, fontSize = 16.sp)
            }
        }
        Row {
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LocationsPreview() {
    Q2Assignment1Theme {
        LocationsApp()
    }
}

