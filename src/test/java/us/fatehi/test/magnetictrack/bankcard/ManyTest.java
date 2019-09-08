/*
 *
 * Magnetic Track Parser
 * https://github.com/sualeh/magnetictrackparser
 * Copyright (c) 2014-2016, Sualeh Fatehi.
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 */
package us.fatehi.test.magnetictrack.bankcard;


import static org.junit.Assert.assertEquals;

import java.time.YearMonth;

import org.junit.Ignore;
import org.junit.Test;

import us.fatehi.creditcardnumber.BankCard;
import us.fatehi.creditcardnumber.CardBrand;
import us.fatehi.magnetictrack.bankcard.BankCardMagneticTrack;

public class ManyTest
{

  @Test
  public void trackA()
    throws Exception
  {
    final BankCardMagneticTrack trackA = BankCardMagneticTrack
      .from("%B5350290149345177^FATEHI/SUALEH^16042010000000000000000000000000000567001000?;5350290149345177=16042010000056700100?");
    debugPrint(trackA);
    final BankCard cardInfo = trackA.toBankCard();
    assertEquals("5350290149345177", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.MasterCard, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2016, 4), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackB()
    throws Exception
  {
    final BankCardMagneticTrack trackB = BankCardMagneticTrack
      .from("%B4181887684889366^FATEHI/SUALEH^1605101097670000000000120000000?;4181887684889366=160510101200009767?");
    debugPrint(trackB);
    final BankCard cardInfo = trackB.toBankCard();
    assertEquals("4181887684889366", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Visa, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2016, 5), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackC()
    throws Exception
  {
    final BankCardMagneticTrack trackC = BankCardMagneticTrack
      .from("%B5391285197433215^FATEHI/SUALEH             ^1701101000001540000000154000000?;5391285197433215=17011010000015400000?");
    debugPrint(trackC);
    final BankCard cardInfo = trackC.toBankCard();
    assertEquals("5391285197433215", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.MasterCard, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2017, 1), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackD()
    throws Exception
  {
    final BankCardMagneticTrack trackD = BankCardMagneticTrack
      .from("%B6011460477609366^FATEHI/SUALEH             ^15101011000606818102?;6011460477609366=15101011000606818102?");
    debugPrint(trackD);
    final BankCard cardInfo = trackD.toBankCard();
    assertEquals("6011460477609366", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Discover, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2015, 10), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackE()
    throws Exception
  {
    final BankCardMagneticTrack trackE = BankCardMagneticTrack
      .from("%B6035320294113574^FATEHI/SUALEH^491210100316000000?;6035320294113574=491210110000316?");
    debugPrint(trackE);
    final BankCard cardInfo = trackE.toBankCard();
    assertEquals("6035320294113574", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Unknown, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2049, 12), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackF()
    throws Exception
  {
    final BankCardMagneticTrack trackF = BankCardMagneticTrack
      .from("%B4181887684889366^FATEHI/SUALEH^1502101072560000000000019000000?;4181887684889366=150210100190007256?");
    debugPrint(trackF);
    final BankCard cardInfo = trackF.toBankCard();
    assertEquals("4181887684889366", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Visa, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2015, 2), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackG()
    throws Exception
  {
    final BankCardMagneticTrack trackG = BankCardMagneticTrack
      .from("%B379580832431161^ /                        ^1508121140165241?;379580832431161=150812114016524100000?+6202408082356005=15046200000010000000000004976?");
    debugPrint(trackG);
    final BankCard cardInfo = trackG.toBankCard();
    assertEquals("379580832431161", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.AmericanExpress, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("", cardInfo.getName().toString());
    assertEquals(YearMonth.of(2015, 8), cardInfo.getExpirationDate()
      .getExpirationDate());
  }

  @Test
  public void trackH()
    throws Exception
  {
    final BankCardMagneticTrack trackH = BankCardMagneticTrack
      .from("%B455618692574^FATEHI/SUALEH             ^888809010299211?;455618692574=888809010299211?");
    debugPrint(trackH);
    final BankCard cardInfo = trackH.toBankCard();
    assertEquals("455618692574", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Visa, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Sualeh Fatehi", cardInfo.getName().toString());
    assertEquals(null, cardInfo.getExpirationDate().getExpirationDate());
  }

  @Ignore
  @Test
  public void trackI()
    throws Exception
  {
    final BankCardMagneticTrack trackI = BankCardMagneticTrack
      .from(";636294169881005271827?");
    debugPrint(trackI);
    final BankCard cardInfo = trackI.toBankCard();
    assertEquals("636294169881005271827", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Unknown, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("", cardInfo.getName().toString());
    assertEquals(null, cardInfo.getExpirationDate().getExpirationDate());
  }

  @Test
  public void trackJ()
    throws Exception
  {
    final BankCardMagneticTrack trackJ = BankCardMagneticTrack
      .from("%B7083560000013710910^MICHAELS OPEN VALUE CARD  ^8551?;7083560000013710910=8551?");
    debugPrint(trackJ);
    final BankCard cardInfo = trackJ.toBankCard();
    assertEquals("7083560000013710910", cardInfo.getPrimaryAccountNumber()
      .getAccountNumber());
    assertEquals(CardBrand.Unknown, cardInfo.getPrimaryAccountNumber()
      .getCardBrand());
    assertEquals("Michaels Open Value Card", cardInfo.getName().toString());
    assertEquals(null, cardInfo.getExpirationDate().getExpirationDate());
  }

  private void debugPrint(final BankCardMagneticTrack track)
  {
    if (false)
    {
      System.out.println(track);
    }
  }

}
