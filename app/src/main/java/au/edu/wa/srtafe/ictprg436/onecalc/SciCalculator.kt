package au.edu.wa.srtafe.ictprg436.onecalc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.LightGray
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.MediumGray
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.Orange

//  todo the buttons have irregular spacing may need to use a grid to make them equal?
//  Had trouble with grid format, thats why i reverted to simple row column format


@Composable
fun SciCalculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(
        modifier = modifier
            .background(Color.Blue)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Text(
                    text = state.numArgOne + (state.operation?.symbol ?: "") + state.numArgTwo,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .background(Color.Black)  //  Added by me to see space
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    fontWeight = FontWeight.Light,
                    //  todo I shrunk from 80 to 70 to crudely stop text field wrapping,
                    //   there is possibly better way
                    fontSize = 70.sp,
                    color = Color.White,
                    maxLines = 2
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                //.height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "Sq",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Sq))
                    }
                )
                CalculatorButton(
                    symbol = "Sin",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Sin))
                    }
                )
                CalculatorButton(
                    symbol = "Cos",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Cos))
                    }
                )
                CalculatorButton(
                    symbol = "Tan",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Tan))
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        ////.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "Pow",
                        modifier = Modifier
                            .background(Orange)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Operation(CalculatorOperation.Power))
                        }
                    )
                    CalculatorButton(
                        symbol = "5",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(5))
                        }
                    )
                    CalculatorButton(
                        symbol = "6",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(6))
                        }
                    )
                    CalculatorButton(
                        symbol = "7",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(7))
                        }
                    )
                    CalculatorButton(
                        symbol = "8",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(8))
                        }
                    )
                    CalculatorButton(
                        symbol = "9",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(9))
                        }
                    )
                    CalculatorButton(
                        symbol = "AC",
                        modifier = Modifier
                            .background(LightGray)
                            //.aspectRatio(2f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Clear)
                        }
                    )
                    CalculatorButton(
                        symbol = "Del",
                        modifier = Modifier
                            .background(LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Delete)
                        }
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = ".",
                        modifier = Modifier
                            .background(Color.LightGray)
                            ////.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Decimal)
                        }
                    )
                    CalculatorButton(
                        symbol = "0",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(2f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(7))
                        }
                    )
                    CalculatorButton(
                        symbol = "1",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(1))
                        }
                    )
                    CalculatorButton(
                        symbol = "2",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(2))
                        }
                    )
                    CalculatorButton(
                        symbol = "3",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(3))
                        }
                    )
                    CalculatorButton(
                        symbol = "4",
                        modifier = Modifier
                            .background(Color.LightGray)
                            //.aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorAction.Number(4))
                        }
                    )
                    CalculatorButton(
                        symbol = "=",
                        modifier = Modifier
                            .background(MediumGray)
                            //.aspectRatio(1f)
                            .weight(2f),
                        onClick = {
                            onAction(CalculatorAction.Calculate)
                        }
                    )
                }
            }
        }
    }

