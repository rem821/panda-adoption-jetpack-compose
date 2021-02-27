package com.example.pandaadoption.screens

import android.view.Gravity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pandaadoption.viewModel.PandaViewModel

@Composable
fun DetailScreen(pandaViewModel: PandaViewModel, navController: NavController) {

    val panda = pandaViewModel.getSelectedPanda()
    val typography = MaterialTheme.typography
    panda?.let {
        Column {
            Image(
                painter = painterResource(id = panda.image),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(300.dp),
                contentScale = ContentScale.Crop,
            )
            Card(modifier = Modifier.padding(16.dp).fillMaxWidth()) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                    Text(
                        panda.name,
                        style = typography.h3,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        panda.location,
                        style = typography.body1,
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        panda.age,
                        style = typography.body2,
                    )
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        panda.story,
                        style = typography.body1,
                    )

                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
            Button(
                onClick = {
                    pandaViewModel.changePandaAdoptionStatus()
                    navController.popBackStack()
                },
                modifier = Modifier.align(Alignment.CenterHorizontally).fillMaxWidth()
                    .padding(16.dp).height(60.dp)
            ) {
                Text(text = pandaViewModel.getAdoptionButtonString(), fontWeight = FontWeight.Bold, style = typography.button)
            }
        }
    } ?: navController.popBackStack()
}