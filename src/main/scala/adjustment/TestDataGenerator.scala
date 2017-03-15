package adjustment

import argonaut.Json

/**
  * Created by salim on 3/14/2017.
  */
object TestDataGenerator extends App {

  def td():Adjustment = {
    Adjustment("x", "abc.1",
      AdjustmentComponent("x", 2.2, "pv") :: AdjustmentComponent("x", 2.2, "pv") :: Nil
    )
  }

  val foo = AdjustmentCodecJson.encode(td())

  println(foo)

}
