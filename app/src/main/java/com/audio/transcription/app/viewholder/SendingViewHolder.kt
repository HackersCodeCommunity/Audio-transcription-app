package com.audio.transcription.app.viewholder

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.audio.transcription.app.R
import com.audio.transcription.app.ui.theme.AudioTranscriptionTheme
import com.audio.transcription.app.ui.theme.ProductSansFonts


@Composable
fun SendingViewHolder(
    image:Int,
    message:String,
    senderId:String
) {

        Row(
            modifier = Modifier
                .fillMaxWidth(), verticalAlignment = Alignment.Bottom
        ) {

            Column(modifier = Modifier.weight(2f)) {
                Text(
                    modifier = Modifier
                        .padding(end = 60.dp)
                        .fillMaxWidth(),
                    text = senderId,
                    fontFamily = ProductSansFonts,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.End
                )
                Box(
                    modifier = Modifier.paint(
                        painterResource(id = R.drawable.sending_chat_bubble),
                        contentScale = ContentScale.FillBounds
                    ), contentAlignment = Alignment.Center
                ) {
                    Text(
                        modifier = Modifier.padding(
                            top = 20.dp,
                            bottom = 20.dp,
                            start = 24.dp,
                            end = 25 .dp
                        ),
                        text =message,
                        color = MaterialTheme.colorScheme.surface,
                        fontFamily = ProductSansFonts,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp
                    )
                }
            }
            Box(
                modifier = Modifier.padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "Image Icon",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape), contentScale = ContentScale.FillBounds
                )

            }
        }

    }

@Preview
@Composable
private fun SenderPreview() {
    AudioTranscriptionTheme {
        SendingViewHolder(
            image = R.drawable.profile_img,
            message = "Good day, everyone! As we all know, our previous attempt " +
                    "at promoting this product was a huge fail. This meeting is for us to come up with" +
                    " new ideas on how we can improve awareness on this product. Any suggestions?" +
                    "Good day, everyone! As we all know, our previous attempt at promoting this product" +
                    " was a huge fail. This meeting is for us to come up with new ideas on how we can improve awareness" +
                    " on this product. Any suggestions?Good day, everyone! As we all know, our previous attempt at promoting this product was a huge fail. This meeting is for" +
                    " us to come up with new ideas on how we can improve awareness on this product. Any suggestions?",
            senderId = "You"
        )
    }
}



