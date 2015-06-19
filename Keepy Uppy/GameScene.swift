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

