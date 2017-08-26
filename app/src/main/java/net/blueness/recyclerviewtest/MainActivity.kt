package net.blueness.recyclerviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import net.blueness.listviewtest.Fruit
import org.jetbrains.anko.find
import java.util.*

class MainActivity : AppCompatActivity() {

    private val fruitList: MutableList<Fruit> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFruitLists();
        val recyclerView: RecyclerView = find(R.id.recycler_view)
//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val fruitAdapter = FruitAdapter(fruitList)
        recyclerView.adapter = fruitAdapter
    }

    private fun initFruitLists() {
        for (i in 0..2){
            val apple = Fruit(getRandomLengthName("Apple"), R.drawable.apple_pic)
            fruitList.add(apple)
            val banana = Fruit(getRandomLengthName("Banana"), R.drawable.banana_pic)
            fruitList.add(banana)
            val orange = Fruit(getRandomLengthName("Orange"), R.drawable.orange_pic)
            fruitList.add(orange)
            val watermelon = Fruit(getRandomLengthName("Watermelon"), R.drawable.watermelon_pic)
            fruitList.add(watermelon)
            val pear = Fruit(getRandomLengthName("Pear"), R.drawable.pear_pic)
            fruitList.add(pear)
            val grape = Fruit(getRandomLengthName("Grape"), R.drawable.grape_pic)
            fruitList.add(grape)
            val pineapple = Fruit(getRandomLengthName("Pineapple"), R.drawable.pineapple_pic)
            fruitList.add(pineapple)
            val strawberry = Fruit(getRandomLengthName("Strawberry"), R.drawable.strawberry_pic)
            fruitList.add(strawberry)
            val cherry = Fruit(getRandomLengthName("Cherry"), R.drawable.cherry_pic)
            fruitList.add(cherry)
            val mango = Fruit(getRandomLengthName("Mango"), R.drawable.mango_pic)
            fruitList.add(mango)
        }
    }

    private fun getRandomLengthName(name:String): String{
        val lenght = Random().nextInt(20) + 1
        val builder = StringBuilder()
        for(i in 0..lenght){
            builder.append(name + "\n")
        }
        return builder.toString()
    }
}
