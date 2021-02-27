package com.example.pandaadoption.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.pandaadoption.Actions
import com.example.pandaadoption.R
import com.example.pandaadoption.model.PandaModel
import com.example.pandaadoption.ui.purple700
import com.example.pandaadoption.viewModel.PandaViewModel


@Composable
fun HomeScreen(pandaViewModel: PandaViewModel, navigate: Actions) {
    Surface(color = MaterialTheme.colors.background) {
        LazyColumn(
            contentPadding = PaddingValues(bottom = 40.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                ListHeader()
            }
            items(pandaViewModel.fetchListOfPandas()) { panda ->
                PandaListItem(panda = panda) {
                    pandaViewModel.selectPanda(it)
                    navigate.openDetail()
                }
            }
        }
    }
}

@Composable
fun PandaListItem(panda: PandaModel, onClick: (PandaModel) -> Unit) {
    val adoptedIcon =
        if (panda.adopted) R.drawable.ic_heart_active else R.drawable.ic_heart_inactive
    MaterialTheme {
        val typography = MaterialTheme.typography
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()
                .clickable(onClick = { onClick(panda) })
        ) {
            Row(horizontalArrangement = Arrangement.End) {
                Image(
                    painter = painterResource(id = panda.image),
                    contentDescription = null,
                    modifier = Modifier.width(100.dp)
                        .height(100.dp)
                        .clip(shape = RoundedCornerShape(8.dp)),
                    contentScale = ContentScale.Crop,
                )

                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp).fillMaxWidth(0.65f)) {
                    Text(
                        panda.name,
                        style = typography.h6,
                        fontWeight = FontWeight.Bold
                    )
                    Text(panda.location, style = typography.body2)
                    Text(panda.age, style = typography.body2)
                }

                Image(
                    painter = painterResource(id = adoptedIcon),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth().height(30.dp).align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun ListHeader() {
    MaterialTheme {
        val typography = MaterialTheme.typography
        Card(
            elevation = 4.dp,
            modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth(),
            backgroundColor = purple700
        ) {
            Column(
                modifier = Modifier.padding(top = 24.dp, bottom = 32.dp, start = 16.dp)
            ) {
                Text(
                    "Let's adopt a panda <3",
                    style = typography.h6,
                    color = Color.White
                )
                Text(
                    "They're so cuddly!",
                    style = typography.body1,
                    color = Color.White
                )
            }
        }
    }
}