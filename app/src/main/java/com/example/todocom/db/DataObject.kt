package com.example.todocom.db

object DataObject {

    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, priority: String, description: String){
        listdata.add(CardInfo(title, priority, description))
    }

    fun getAllData():List<CardInfo>{
        return listdata
    }

    fun deleteAll(){
        listdata.clear()
    }

    fun getData(pos: Int): CardInfo {
        return listdata[pos]
    }

    fun deleteData(pos:Int){
        listdata.removeAt(pos)
    }


    fun updateData(pos: Int, title: String, priority: String, toString: String){
        listdata[pos].title = title
        listdata[pos].priority = priority
    }

}