//
//  ViewController.swift
//  iosApp
//
//  Created by Daniel Ghebrat on 22/03/2022.
//

import UIKit
import shared
class ViewController: UIViewController {
    let greet = Greeting().greeting()

    @IBOutlet var buttonsRow4: [UIButton]!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        print(greet)
        let x = buttonsRow4[2].titleLabel?.text
        if let bla = x {
            print("Printing : \(bla)")

        }
    }


}

