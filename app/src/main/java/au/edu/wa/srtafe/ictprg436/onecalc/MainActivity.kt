package au.edu.wa.srtafe.ictprg436.onecalc

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.MediumGray
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.OneCalcTheme

//  Up to 24.36
//  https://www.youtube.com/watch?v=-aTcFJWxEQA


/**
 * 1.	Your app will need to display the numbers the user inputs and the result of the calculation.
 * 2.	It will have buttons for numbers 0-9 and a clear display button
 * 3.	In portrait mode it will display operator buttons (+, -, *, /, =)
 * 4.	In landscape mode it will turn in to a scientific calculator with additional
 *      operator buttons for √, pow, tan, sin,cos.
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OneCalcTheme {
                //  NOTE after adding the viewmodel to the dependencies PRESS SYNC
                //otherwise this will not resolve viewModel
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                // Fetching current app configuration
                val configuration = LocalConfiguration.current

                // When orientation is Landscape
                if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {

                    SciCalculator(
                        state = state,
                        onAction = viewModel::onAction,
                        buttonSpacing = buttonSpacing,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.DarkGray)
                            .padding(16.dp)
                    )
                }

                // Other wise
                else {
                    //Text("Portrait")
                    Calculator(
                        state = state,
                        onAction = viewModel::onAction,
                        buttonSpacing = buttonSpacing,
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.DarkGray)
                            .padding(16.dp)
                    )
                }


            }
        }
    }
}





