/**
  * Created by salim on 3/7/2017.
  */
import argonaut._, Argonaut._


package object adjustment {
  implicit def AdjustmentComponentCodecJson = casecodec3(AdjustmentComponent.apply, AdjustmentComponent.unapply)("measure", "quantity", "balancesheet")
  implicit def AdjustmentCodecJson = casecodec3(Adjustment.apply, Adjustment.unapply)("id", "book", "components")
}
