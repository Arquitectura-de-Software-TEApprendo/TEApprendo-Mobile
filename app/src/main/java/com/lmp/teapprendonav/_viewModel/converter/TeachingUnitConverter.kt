package com.lmp.teapprendonav._viewModel.converter

import com.lmp.teapprendonav._model.data.TeachingUnit
import com.lmp.teapprendonav._model.ui.MyMessage

fun convertTeachingUnitListToMyMessageList(teachingUnits: List<TeachingUnit>): List<MyMessage> {
    val messages: MutableList<MyMessage> = mutableListOf<MyMessage>()
    teachingUnits.forEach {
        messages += convertTeachingUnitToMyMessage(it)
    }
    return messages
}

fun convertTeachingUnitToMyMessage(teachingUnit: TeachingUnit): MyMessage {
    return MyMessage(teachingUnit.name, teachingUnit.duration)
}