package fi.lauriari.to_docompose.data.models

import androidx.compose.ui.graphics.Color
import fi.lauriari.to_docompose.ui.theme.HighPriorityColor
import fi.lauriari.to_docompose.ui.theme.LowPriorityColor
import fi.lauriari.to_docompose.ui.theme.MediumPriorityColor
import fi.lauriari.to_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}