package com.cynthiawomentechsters.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cynthiawomentechsters.happybirthdaycard.ui.theme.HappyBirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Happy Birthday Atinuke!",
                        with = "May God bless you for being an amazing friend :)",
                        from = "From Cynthia")
                }
                   GreetingImage(message = "Happy Birthday Atinuke!",
                       with = "May God bless you for being an amazing friend :)",
                       from = "From Cynthia"
                   )
            }
            }
        }
    }


@Composable
fun GreetingText(message: String, from: String, with:String, modifier: Modifier = Modifier) {
    //create a column so that texts dont overlap
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 70.dp)
    ) {
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = with,
            fontSize = 30.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)

        )

        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
//                .padding(start = 150.dp)
//                .padding(top = 50.dp)
//                .padding(36.dp)

        )
    }
}

@Composable
fun GreetingImage(message: String, with:String, from:String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
     Box {
         Image(
             painter = image,
             contentDescription = null
         )
         GreetingText(
             message = message,
             with = with,
             from =from ,
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(8.dp))
     }
     }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayCardTheme {
        GreetingImage(
            message = "Happy Birthday Atinuke!",
            with = "May God bless you for being an amazing friend",
            from = "From Cynthia",
            )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    HappyBirthdayCardTheme {
//        GreetingImage(
//            message = "Happy Birthday Atinuke!",
//            with = "May God bless you for being an amazing friend",
//            from = "From Cynthia",
//        )
//    }
//}