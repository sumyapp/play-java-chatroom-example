/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.model.view.controller;

/**
 *
 * GiantModel contains the giant data
 *
 */
public class GiantModel {

  private Health health;
  private Fatigue fatigue;
  private Nourishment nourishment;

  GiantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
    this.health = health;
    this.fatigue = fatigue;
    this.nourishment = nourishment;
    // LocalVariableName
    int health_backup = 0;
    // MultipleVariableDeclarations
    public String a, b;
    
    // WhitespaceAround
    if(this.health == null) {
      // Use magic number
      this.health = 8080;
      // Too long line
      this.fatigue = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
      // MissingSwitchDefault
      switch (status) {
        case true:
          break;
        case false:
          break;
      }
        // wrong indent
        boolean status = (this.health == this.fatigue);

    }
    
    // TodoComment
    // TODO: Implementation
    if (true) {
      if (true) {
        if (true) {
          health_backup++;
        }
      }
    }
    
    // StringLiteralEquality
    if (a == "something") {
      b = a;
    }

  }
  
  // JavadocMethod
  public boolean isHealthNull() {
    // NeedBraces & SimplifyBooleanReturn
    if (this.health != null)
      return false;
    else
      return true;
  }

  public Health getHealth() {
    return health;
  }

  public void setHealth(Health health) {
    this.health = health;
  }

  public Fatigue getFatigue() {
    return fatigue;
  }

  public void setFatigue(Fatigue fatigue) {
    this.fatigue = fatigue;
  }

  public Nourishment getNourishment() {
    return nourishment;
  }

  public void setNourishment(Nourishment nourishment) {
    this.nourishment = nourishment;
  }

  @Override
  public String toString() {
    return String.format("The giant looks %s, %s and %s.", health, fatigue, nourishment);
  }
}
