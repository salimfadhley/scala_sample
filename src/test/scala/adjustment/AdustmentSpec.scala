package adjustment
import argonaut.Parse
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 3/7/2017.
  */
class AdustmentSpec extends FlatSpec with Matchers {

  "Adjustment" can "serialize to Json" in {

    val a = Adjustment( "x", "book1", AdjustmentComponent("measure1", 1.2, "pv") :: AdjustmentComponent("measure2", 1.3, "pv") :: Nil)

    val encoded = AdjustmentCodecJson.encode(a)
    val maybeAdjustment: Option[Adjustment] = Parse.decodeOption[Adjustment](encoded.toString())

    maybeAdjustment match {
      case Some(aa) => assert(a==aa)
      case None => throw new RuntimeException("Decode failed")
    }





  }

}
