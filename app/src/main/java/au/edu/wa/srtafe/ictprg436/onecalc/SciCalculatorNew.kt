package au.edu.wa.srtafe.ictprg436.onecalc

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
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
import au.edu.wa.srtafe.ictprg436.onecalc.ui.theme.Orange

//todo modify this to include more operations


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SciCalculatorNew(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(
        modifier = modifier
            .background(Color.Magenta)
    ) {
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
                    fontSize = 80.sp,
                    color = Color.White,
                    maxLines = 2
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "A",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "B",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "C",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "E",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "F",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "G",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "H",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "A",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "B",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "C",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "E",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "F",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "G",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "H",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "A",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "B",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "C",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "E",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "F",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "G",
                    modifier = Modifier
                        .background(LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    //.height(IntrinsicSize.Min),
                    onClick = {}
                )
                CalculatorButton(
                    symbol = "H",
                    modifier = Modifier
                        .background(Color.LightGray)
                        //.aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
            }
        } //col


            /*
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
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
                    symbol = "0",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )

            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "Sq",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Unit//onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
                CalculatorButton(
                    symbol = "Pow",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Unit//onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
                CalculatorButton(
                    symbol = "Tan",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Unit//onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
                CalculatorButton(
                    symbol = "Sin",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Unit//onAction(CalculatorAction.Operation(CalculatorOperation.Sin))
                    }
                )
                CalculatorButton(
                    symbol = "Cos",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        Unit//onAction(CalculatorAction.Operation(CalculatorOperation.Cos))
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
                CalculatorButton(
                    symbol = "X",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
 */       }


    }







