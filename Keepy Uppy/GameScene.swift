//
//  GameScene.swift
//  Keepy Uppy
//
//  Created by Matthew Allen Lin on 6/18/15.
//  Copyright (c) 2015 Matthew Allen Lin. All rights reserved.
//

import SpriteKit
import CoreMotion

class GameScene: SKScene
{

    //Set up the GameScene
    override init(size: CGSize) {
        super.init(size: size)
        
        anchorPoint = CGPoint(x: 0, y: 1.0)
        
        let background = SKSpriteNode(imageNamed: "Bowling Alley.jpg")
        background.position = CGPoint(x: 0, y: 0)
        background.anchorPoint = CGPoint(x: 0, y: 1.0)
        addChild(background)
    }

    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    var contentCreated = false
    
    override func didMoveToView(view: SKView)
    {
        if(!contentCreated)
        {
            createContent()
            contentCreated = true
        }
    }
    
    func createContent()
    {
        //For now, let the user use a beach ball
        let ball = SKSpriteNode(imageNamed: "Beach Ball.png")
        ball.position = CGPoint(x: size.width/2, y: size.height/2)
        addChild(ball)
        
        backgroundColor = SKColor.whiteColor()
    }
    
    override func update(currentTime: CFTimeInterval)
    {}
}

